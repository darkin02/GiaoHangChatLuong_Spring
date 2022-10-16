package org.examp.Controllers;

import org.examp.Entitys.*;
import org.examp.Model.CreateBill;
import org.examp.Model.DangKy;
import org.examp.Service.*;
import org.examp.Service.impl.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    JavaMailSender mailSender;
    @Autowired
    ThymeleafService thymeleafService;

    @Autowired
    private IKhachHangService khachHangService;

    @Autowired
    private ILoaiVanChuyenService loaiVanChuyenService;

    @Autowired
    private ILoaiHHService loaiHHService;

    @Autowired
    private ITaiKhoanService taiKhoanService;

    @Autowired
    private INhanVienService nhanVienService;

    @Autowired
    private IPhieuyeucauService phieuyeucauService;

    @Autowired
    private ICtTuyenDuongService ctTuyenDuongService;

    @Autowired
    private ITuyenDuongService tuyenDuongService;

    @Autowired
    private IHoaDonService hoaDonService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private ICtRoleService ctRoleService;
    public String md5(String str){
        MessageDigest md;
        String result = "";
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            BigInteger bi = new BigInteger(1, md.digest());

            result = bi.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }
    /* Dang nhap */
    @GetMapping("/login")
    public String printLogin(HttpSession session){
        if (session.getAttribute("TaiKhoan") != null)
        {
            String tk = session.getAttribute("TaiKhoan").toString();
            Taikhoan tk1 = taiKhoanService.getOne(tk);
            tk1.setTrangThai(Short.valueOf("0"));

        }
        return "Admin/Login";
    }
    @PostMapping(value = "/login")
    public String printLogin(HttpServletRequest request,HttpSession session, Model model){
        String mk = md5(request.getParameter("Password"));

        Taikhoan tk = taiKhoanService.getOne(request.getParameter("UserName"));
        if (tk != null)
        {
            if(mk.equals(tk.getMatKhau().toLowerCase())){
                session.setAttribute("TaiKhoan",tk.getTenTK());
                Cap_quyen(tk.getTenTK(),session);
                String srcImg = "/GiaoHangChatLuong_war/Resources/img/" + tk.getTenTK() +".jpg";
                session.setAttribute("ImgAcc",srcImg);
                return "redirect:/admin/index";
            }
            else
            {
                model.addAttribute("error","Mat khau khong dung");
            }
        }
        else  model.addAttribute("error","Ten tai khoan khong co");
        return "Admin/Login";
    }

    /* Dang ky  */
    @GetMapping("/register")
    public String printRegister(){
        return "Admin/Register";
    }
    @PostMapping(value = "/register")
    public String printRegister(HttpServletRequest request,@ModelAttribute DangKy dangKy,Model model){
        Taikhoan checktk = taiKhoanService.getOne(request.getParameter("UserName"));
        if (checktk != null)
        {
            model.addAttribute("error","Tên đăng nhập đã có!");
        }
        else
        {
            Nhanvien manv = nhanVienService.getOneBySdt(request.getParameter("SDT"));
            if (manv != null)
            {
                Taikhoan tk = new Taikhoan();
                tk.setTenTK(request.getParameter("UserName"));
                tk.setMatKhau(md5(request.getParameter("Password")));
                tk.setEmail(request.getParameter("Email"));
                tk.setLoaiTK(Short.valueOf("0"));
                tk.setMaNV(manv);
                tk.setTrangThai(Short.valueOf("0"));
                taiKhoanService.Add(tk);
                model.addAttribute("error","Tạo tài khoản thành công!");
                model.addAttribute("success",true);
            }
            else
            {
                model.addAttribute("error","Số điện thoại không có trong danh sách sinh viên!");
            }

        }
        return "Admin/Register";
    }
    /* Quen mat khau  */
    @GetMapping("/forgetpassword")
    public ModelAndView printForgetPassword(){
        ModelAndView mav = new ModelAndView("Admin/ForgetPassword");
        return mav;
    }

    @PostMapping("/forgetpassword")
    public String printForgetPassword(HttpServletRequest request, HttpSession session,Model model){
        String email = request.getParameter("Email");
        Taikhoan tk = taiKhoanService.getOneByEmail(email);
        if(tk !=null){
            try {
                MimeMessage message = mailSender.createMimeMessage();
                MimeMessageHelper helper;
                helper = new MimeMessageHelper(message, true);
                SimpleMailMessage mailMessage = new SimpleMailMessage();
                helper.setFrom("giaohangchatluongvn@gmail.com");
                helper.setTo(email);
                helper.setSubject("Forgot Password");
                Random rd = new Random();
                String SMS = String.valueOf(rd.nextInt(999999 -100000)+100000);
                session.setAttribute("SMS", SMS);
                session.setAttribute("TaiKhoan",tk);
                helper.setText(thymeleafService.getContentAdmin(email,SMS,"ConfirmForgetPassword"),true);
                mailSender.send(message);
                return "redirect:/admin/confirmforgetpassword";
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else model.addAttribute("error","Không có tài khoản ứng với Email!");
        return "admin/forgetpassword";
    }

    /* Xac nha quen mat khau  */

    @GetMapping("/confirmforgetpassword")
    public String printConfirmForgetPassword(){
        return "Admin/ConfirmForgetPassword";
    }

    @PostMapping("/confirmforgetpassword")
    public String printConfirmForgetPassword(HttpServletRequest request,HttpSession session, Model model){
        String sms = request.getParameter("sms");
        if(session.getAttribute("SMS").equals(sms))return "redirect:/admin/newpassword";
        model.addAttribute("message","Mã xác nhận không đúng");
        return "Admin/ConfirmForgetPassword";
    }

    /* Dat mat khau moi  */

    @GetMapping("/newpassword")
    public String printNewPassword(){
        return "Admin/NewPassword";
    }

    @PostMapping("/newpassword")
    public String printNewPassword(HttpServletRequest request,HttpSession session,Model model){
        String pass = request.getParameter("Pass");
        String againPass = request.getParameter("AgainPass");
        if(pass.equals(againPass)){
         Taikhoan tk = (Taikhoan) session.getAttribute("TaiKhoan");
         tk.setMatKhau(md5(pass));
         taiKhoanService.Add(tk);
            model.addAttribute("error","Đổi mật khẩu thành công!");
        }
        else model.addAttribute("error","Mật khẩu không trùng khớp!");
        return "Admin/NewPassword";
    }

    /* trang chu admin  */

    public void Cap_quyen(String TenTK,HttpSession session)
    {
        for (CtRole item:ctRoleService.getAll()
        ) {
            session.removeAttribute(roleService.getOne(item.getIDRole()).getRoleName());
        }
        for (CtRole item:ctRoleService.getAllByTenTK(TenTK)
             ) {
           session.setAttribute(roleService.getOne(item.getIDRole()).getRoleName(),true);
        }
    }
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String printIndex(HttpSession session){
        return "Admin/Index";
    }

    //---------------------Phân chức năng------------

    /* Bill */
    @GetMapping("/createbill/{SoPYC}")
    public String printCreateBillFormPYC(Model model,@PathVariable String SoPYC,HttpSession session){
        session.setAttribute("PhieuYeuCau",SoPYC);
        return "redirect:/admin/createbill";
    }
    @GetMapping("/indexbill")
    public String printIndexBill(Model model){
        model.addAttribute("list",hoaDonService.getAll());
        return "Admin/IndexBill";
    }
    @GetMapping("/createbill")
    public String printCreateBill(Model model,HttpSession session){
        String temp =  String.valueOf(session.getAttribute("PhieuYeuCau"));
        if(temp != null){
            Phieuyeucau pyc = phieuyeucauService.getOne(temp);
            Khachhang khachhang = pyc.getMaKH();
            Khachnhan khachnhan = pyc.getMaKN();
            CreateBill bill = new CreateBill(khachhang.getTenKH(),khachhang.getSdt(),pyc.getNgayLap(),"","","",khachhang.getDiaChi(),khachhang.getGioiTinh()==0?"Nam":"Nữ",khachnhan.getTenKN(),khachnhan.getSdt(),"","","",khachnhan.getDiaChi(),khachnhan.getGioiTinh()?"Nam":"Nữ",0,pyc.getMaLVC().getMaLVC());

            model.addAttribute("bill",bill);
        }
        else {
            List<Khachhang> listKH = khachHangService.getAll();
            List<Loaivanchuyen> listCatagory = loaiVanChuyenService.getAll();
            model.addAttribute("listLVC", listCatagory);
        }
        return "Admin/CreateBill";
    }

    @PostMapping("/createbill")
    public String printCreateBill(HttpServletRequest request, HttpSession session, Model model, @ModelAttribute CreateBill createBill){
        String temp =  String.valueOf(session.getAttribute("PhieuYeuCau"));
        if(temp != null){
            Phieuyeucau pyc = phieuyeucauService.getOne(temp);
            Khachhang khachhang = pyc.getMaKH();
            Khachnhan khachnhan = pyc.getMaKN();
            Tuyenduong tuyenduong = new Tuyenduong();
            int i = khachhang.getDiaChi().indexOf("Thành Phố");
            String s = "";
            if(i != -1){
                s = String.copyValueOf(khachhang.getDiaChi().toCharArray(),i+10,khachhang.getDiaChi().length()-i-10);
            }
            int x = khachhang.getDiaChi().indexOf("Tỉnh");
            if(x != -1){
                s = String.copyValueOf(khachhang.getDiaChi().toCharArray(),i+4,khachhang.getDiaChi().length()-i-4);
            }
            for (CtTuyenduong item:ctTuyenDuongService.getAll()
                 ) {
               if(item.getMaNK().getTenNK().indexOf(s) != -1)
                   tuyenduong = item.getMaTD();
            }
            Hoadonvanchuyen hoadonvanchuyen = new Hoadonvanchuyen();
            Boolean cod = Boolean.valueOf(request.getParameter("cod"));
            hoadonvanchuyen.setSoHD("temp");
            hoadonvanchuyen.setCod(Short.valueOf(cod?"0":"1"));
            hoadonvanchuyen.setMaKH(khachhang);
            hoadonvanchuyen.setMaKN(khachnhan);
            hoadonvanchuyen.setMaTD(tuyenduong);
            hoadonvanchuyen.setMaLVC(pyc.getMaLVC());
            hoadonvanchuyen.setNgayLapHD(pyc.getNgayLap());
            hoadonvanchuyen.setTienVC(BigInteger.valueOf(100000));
            hoadonvanchuyen.setTongTien(BigInteger.valueOf(100000));
            hoadonvanchuyen.setMaTT(new Trangthai("TT01"));
            hoaDonService.Add(hoadonvanchuyen);
        }
        else {
            List<Khachhang> listKH = khachHangService.getAll();
            List<Loaivanchuyen> listCatagory = loaiVanChuyenService.getAll();
            model.addAttribute("listLVC", listCatagory);
        }
        return "Admin/CreateBill";
    }

    /* Customer */
    @GetMapping("/indexcustomer")
    public ModelAndView printIndexCustomer(){
        List<Khachhang> list = khachHangService.getAll();
        ModelAndView khachHang = new ModelAndView("Admin/IndexCustomer");
        khachHang.addObject("list", list);
        return khachHang;
    }

    @GetMapping("/createcustomer")
    public String printCreateCustomer(){
        return "Admin/CreateCustomer";
    }

    @PostMapping("/createcustomer")
    public String printCreateCustomer(HttpServletRequest request,HttpSession session, Model model){
        return "Admin/CreateCustomer";
    }

    /* Department */

    @GetMapping("/createdepartment")
    public String printCreateDepartment(){
        return "Admin/CreateDepartment";
    }

    @PostMapping("/createdepartment")
    public String printCreateDepartment(HttpServletRequest request,HttpSession session, Model model){
        return "Admin/CreateDepartment";
    }

    /* Recipients */

    @GetMapping("/indexrecipients")
    public String printIndexRecipients(Model model){
        model.addAttribute("list",phieuyeucauService.getAll());
        return "Admin/IndexRecipients";
    }

    @GetMapping("/createrecipients")
    public String printCreateRecipients(Model model){
        model.addAttribute("list",phieuyeucauService.getAll());
        return "Admin/CreateRecipients";
    }

    @PostMapping("/createrecipients")
    public String printCreateRecipients(HttpServletRequest request,HttpSession session, Model model){
        return "Admin/CreateRecipients";
    }

    /* Staff */

    @GetMapping("/createstaff")
    public String printCreateStaff(){
        return "Admin/CreateStaff";
    }

    @PostMapping("/createstaff")
    public String printCreateStaff(HttpServletRequest request,HttpSession session, Model model){
        return "Admin/CreateStaff";
    }

    /* WareHouse */

    @GetMapping("/createwarehouse")
    public String printCreateWareHouse(){
        return "Admin/CreateWareHouse";
    }

    @PostMapping("/createwarehouse")
    public String printCreateWareHouse(HttpServletRequest request,HttpSession session, Model model){
        return "Admin/CreateWareHouse";
    }
}
