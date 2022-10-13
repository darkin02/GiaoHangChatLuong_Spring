package org.examp.Controllers;

import org.examp.Entitys.*;
import org.examp.Model.Blog_ItemModel;
import org.examp.Model.DangKyPhieuGui;
import org.examp.Repository.LoaiVanChuyenRepository;
import org.examp.Service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Controller
public class UserController {

    @Autowired
    LoaiVanChuyenService loaiVanChuyenService;

    @Autowired
    KhachHangService khachHangService;

    @Autowired
    UserKhService userKhService;

    @Autowired
    KhachNhanService khachNhanService;

    @Autowired
    PhieuyeucauService phieuyeucauService;
    @RequestMapping(value = "/")
    public ModelAndView printIndex(Model model){

        ModelAndView mav = new ModelAndView("User/index");
        return mav;
    }

    @GetMapping(value = "/about")
    public ModelAndView printAbout(Model model){
        ModelAndView mav = new ModelAndView("User/about");
        return mav;
    }
    @GetMapping(value = "/blog/{page}")
    public ModelAndView printBlog(Model model,@PathVariable int page){
        int pageSize = 3;
        int pageNum = page;
        List<Blog_ItemModel> lst = Blog_ItemModel.Init();
        model.addAttribute("PageNumber",pageNum);
        model.addAttribute("PageCount",(int)Math.ceil((double)lst.size()/(double)pageSize));
        List<Blog_ItemModel> lst1 = new ArrayList<>();
        int dem = 0;
        for (int i = (page-1)*pageSize ;i< lst.size() ;i++ ){
            lst1.add(lst.get(i));
            dem++;
            if (dem == pageSize) break;
        }
        model.addAttribute("list",lst1);
        ModelAndView mav = new ModelAndView("User/blog");
        return mav;
    }
    @GetMapping(value = "/contact")
    public ModelAndView printContact(Model model){
        ModelAndView mav = new ModelAndView("User/contact");
        return mav;
    }
    @GetMapping(value = "/price")
    public ModelAndView printPrice(Model model){
        ModelAndView mav = new ModelAndView("User/price");
        return mav;
    }
    @GetMapping(value = "/service")
    public ModelAndView printService(Model model){
        ModelAndView mav = new ModelAndView("User/service");
        return mav;
    }
    @GetMapping(value = "/single")
    public ModelAndView printSingle(Model model){
        ModelAndView mav = new ModelAndView("User/single");
        return mav;
    }

    @GetMapping(value = "/request")
    public String printRequest(Model model){
        List<Loaivanchuyen> listCatagory = loaiVanChuyenService.getAll();
        model.addAttribute("listLVC", listCatagory);
        return "User/requestForm";
    }

    @PostMapping(value = "/request")
    public String printRequest(Model model, @ModelAttribute DangKyPhieuGui dangKyPhieuGui){
        Khachhang khachhang = khachHangService.getOneBySdt(dangKyPhieuGui.getsDTKh());
        Khachnhan khachnhan = khachNhanService.getOneBySdt(dangKyPhieuGui.getsDTKN());
        if(khachhang == null){
            try {
                khachhang = new Khachhang();
                khachhang.setMaKH("temp");
                khachhang.setSdt(dangKyPhieuGui.getsDTKh());
                khachhang.setGioiTinh(Short.valueOf(dangKyPhieuGui.getGioiTinhKH().equals("Nam")?"0":"1"));
                khachhang.setDiaChi(dangKyPhieuGui.getFullAddressKH(dangKyPhieuGui));
                khachhang.setTenKH(dangKyPhieuGui.getTenKH());
                khachHangService.Add(khachhang);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        if(khachnhan == null){
            try {
                khachnhan = new Khachnhan();
                khachnhan.setMaKN("temp");
                khachnhan.setSdt(dangKyPhieuGui.getsDTKN());
                khachnhan.setGioiTinh(dangKyPhieuGui.getGioiTinhKN().equals("Nam")?true:false);
                khachnhan.setDiaChi(dangKyPhieuGui.getFullAddressKN(dangKyPhieuGui));
                khachnhan.setTenKN(dangKyPhieuGui.getTenKN());
                khachNhanService.Add(khachnhan);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        khachhang = khachHangService.getOneBySdt(dangKyPhieuGui.getsDTKh());
        khachnhan = khachNhanService.getOneBySdt(dangKyPhieuGui.getsDTKN());
        Phieuyeucau phieuyeucau = new Phieuyeucau();
        phieuyeucau.setMaKH(khachhang);
        phieuyeucau.setMaKN(khachnhan);
        phieuyeucau.setKhoiLuong(BigDecimal.valueOf(dangKyPhieuGui.getKg()));
        Loaivanchuyen loaivanchuyen = loaiVanChuyenService.getOne(dangKyPhieuGui.getMaLVC());
        phieuyeucau.setMaLVC(loaivanchuyen);
        phieuyeucau.setTrangThai(false);
        phieuyeucau.setThanhToan(BigInteger.valueOf(100000));
        java.util.Date javaDate = new java.util.Date();
        java.sql.Date mySQLDate = new java.sql.Date(javaDate.getTime());
        phieuyeucau.setNgayLap(mySQLDate);
        phieuyeucau.setSoPYC("temp");
        phieuyeucauService.Add(phieuyeucau);
        return "User/requestForm";
    }
}
