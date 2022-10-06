package org.examp.Controllers;

import org.examp.Model.DangKy;
import org.examp.Service.ThymeleafService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    JavaMailSender mailSender;
    @Autowired
    ThymeleafService thymeleafService;
    /* Dang nhap */
    @GetMapping("/login")
    public ModelAndView printLogin(){
        ModelAndView mav = new ModelAndView("Admin/Login");
        return mav;
    }
    @PostMapping(value = "/login")
    public ModelAndView printLogin(@ModelAttribute DangKy dangKy){
        ModelAndView mav = new ModelAndView("Admin/Login");
        return mav;
    }

    /* Dang ky  */
    @GetMapping("/register")
    public ModelAndView printRegister(){
        ModelAndView mav = new ModelAndView("Admin/Register");
        return mav;
    }
    @PostMapping(value = "/register")
    public ModelAndView printRegister(@ModelAttribute DangKy dangKy){
        ModelAndView mav = new ModelAndView("Admin/Register");
        return mav;
    }
    /* Quen mat khau  */
    @GetMapping("/forgetpassword")
    public ModelAndView printForgetPassword(){
        ModelAndView mav = new ModelAndView("Admin/ForgetPassword");
        return mav;
    }

    @PostMapping("/forgetpassword")
    public String printForgetPassword(HttpServletRequest request, HttpSession session){
        String email = request.getParameter("Email");
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
            helper.setText(thymeleafService.getContentAdmin(email,SMS,"ConfirmForgetPassword"),true);
            mailSender.send(message);
            return "redirect:/admin/confirmforgetpassword";
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
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
        if(session.getAttribute("SMS").equals(sms))return "admin/login";
        model.addAttribute("message","Mã xác nhận không đúng");
        return "Admin/ConfirmForgetPassword";
    }

    /* Dat mat khau moi  */

    @GetMapping("/newpassword")
    public ModelAndView printNewPassword(){
        ModelAndView mav = new ModelAndView("Admin/NewPassword");
        return mav;
    }

    @PostMapping("/newpassword")
    public ModelAndView printNewPassword(HttpServletRequest request){
        String sdt = request.getParameter("sdt");
        ModelAndView mav = new ModelAndView("Admin/NewPassword");
        return mav;
    }

    /* trang chu admin  */

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView printIndex(HttpSession session){
        session.setAttribute("Phân Quyền",true);
        ModelAndView mav = new ModelAndView("Admin/Index");
        return mav;
    }

    //---------------------Phân chức năng------------

    /* Bill */

    @GetMapping("/createbill")
    public String printCreateBill(){
        return "Admin/CreateBill";
    }

    @PostMapping("/createbill")
    public String printCreateBill(HttpServletRequest request,HttpSession session, Model model){
        return "Admin/CreateBill";
    }

    /* Customer */

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

    /* Goods */

    @GetMapping("/creategoods")
    public String printCreateGoods(){
        return "Admin/CreateGoods";
    }

    @PostMapping("/createdegoods")
    public String printCreateGoods(HttpServletRequest request,HttpSession session, Model model){
        return "Admin/CreateGoods";
    }

    /* Recipients */

    @GetMapping("/createrecipients")
    public String printCreateRecipients(){
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
