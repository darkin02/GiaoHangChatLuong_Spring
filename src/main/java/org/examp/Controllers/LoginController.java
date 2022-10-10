package org.examp.Controllers;

import org.examp.Entitys.Taikhoan;
import org.examp.Entitys.Userkh;
import org.examp.Model.DangKy;
import org.examp.Service.ThymeleafService;
import org.examp.Service.impl.UserKhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    JavaMailSender mailSender;
    @Autowired
    ThymeleafService thymeleafService;

    @Autowired
    private UserKhService userKhService;

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
    @GetMapping(value = "/index")
    public String printIndex(){
        return "Login/Login";
    }

    @PostMapping(value = "/index")
    public String printIndex(Model model,HttpSession session,HttpServletRequest request){
        Userkh userkh = userKhService.getOne(request.getParameter("sDT"));
        String mk = md5(request.getParameter("password"));
        if (userkh != null)
        {
            if(mk.equals(userkh.getMatKhau().toLowerCase())){
                session.setAttribute("UserName",userkh.getUserName());
                return "redirect:/";
            }
            else
            {
                model.addAttribute("error","Mat khau khong dung");
            }
        }
        else  model.addAttribute("error","Số điện thoại khong co");
        return "Login/Login";
    }
        /* Dang ky  */
    @GetMapping("/register")
    public String printRegister(){
        return "Login/Register";
    }
    @PostMapping(value = "/register")
    public String printRegister(@ModelAttribute DangKy dangKy, Model model, HttpSession session){
        String email = dangKy.getEmail();
        Userkh userkh = userKhService.getOneBySdt(dangKy.getSDT());
        if(userkh == null){
            try {
                MimeMessage message = mailSender.createMimeMessage();
                MimeMessageHelper helper;
                helper = new MimeMessageHelper(message, true);
                SimpleMailMessage mailMessage = new SimpleMailMessage();
                helper.setFrom("giaohangchatluongvn@gmail.com");
                helper.setTo(email);
                helper.setSubject("Đăng ký mới");
                Random rd = new Random();
                String SMS = String.valueOf(rd.nextInt(999999 -100000)+100000);
                helper.setText(thymeleafService.getContent(dangKy,"ConfimNewUser",SMS),true);
                mailSender.send(message);
                session.setAttribute("inforDangKy",dangKy);
                session.setAttribute("SMS", SMS);
                return "redirect:/Login/ConfirmRegister";
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        else model.addAttribute("error","Số điện thoại đã đang ký!");
        return "Login/Register";
    }

    /*Xac nhan Dang ky  */
    @GetMapping("/confirmregister")
    public String printConfirmRegister(){
        ModelAndView mav = new ModelAndView("Login/ConfirmRegister");
        return "Login/ConfirmRegister";
    }

    @PostMapping("/confirmregister")
    public String printConfirmRegister(HttpServletRequest request,HttpSession session,Model model){
        String sms = request.getParameter("sms");
        if(sms.equals(session.getAttribute("SMS"))){
            model.addAttribute("error","Đăng ký thành công!");
            return "redirect:/Login/login";
        }
        model.addAttribute("error","Mã xác nhận không đúng!");
        return "Login/ConfirmRegister";
    }
    /* Quen mat khau  */
    @GetMapping("/forgetpassword")
    public ModelAndView printForgetPassword(){
        ModelAndView mav = new ModelAndView("Login/ForgetPassword");
        return mav;
    }

    @PostMapping("/forgetpassword")
    public ModelAndView printForgetPassword(HttpServletRequest request){
        String sdt = request.getParameter("sdt");
        ModelAndView mav = new ModelAndView("Login/ForgetPassword");
        return mav;
    }

    /* Xac nha quen mat khau  */

    @GetMapping("/confirmforgetpassword")
    public ModelAndView printConfirmForgetPassword(){
        ModelAndView mav = new ModelAndView("Login/ConfirmForgetPassword");
        return mav;
    }

    @PostMapping("/confirmforgetpassword")
    public ModelAndView printConfirmForgetPassword(HttpServletRequest request){
        String sdt = request.getParameter("sdt");
        ModelAndView mav = new ModelAndView("Login/ConfirmForgetPassword");
        return mav;
    }

    /* Dat mat khau moi  */

    @GetMapping("/newpassword")
    public ModelAndView printNewPassword(){
        ModelAndView mav = new ModelAndView("Login/NewPassword");
        return mav;
    }

    @PostMapping("/newpassword")
    public ModelAndView printNewPassword(HttpServletRequest request){
        String sdt = request.getParameter("sdt");
        ModelAndView mav = new ModelAndView("Login/NewPassword");
        return mav;
    }
}

