package org.examp.Controllers;

import org.examp.Model.DangKy;
import org.examp.Service.ThymeleafService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    JavaMailSender mailSender;
    @Autowired
    ThymeleafService thymeleafService;
        @RequestMapping(value = "/index")
        public ModelAndView printIndex(Model model){
            ModelAndView mav = new ModelAndView("Login/login");
            return mav;
        }
        /* Dang ky  */
    @GetMapping("/register")
    public ModelAndView printRegister(){
        ModelAndView mav = new ModelAndView("Login/register");
        return mav;
    }
    @PostMapping(value = "/register")
    public ModelAndView printRegister(@ModelAttribute DangKy dangKy){
        String email = dangKy.getEmail();
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper;
            helper = new MimeMessageHelper(message, true);
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            helper.setFrom("giaohangchatluongvn@gmail.com");
            helper.setTo(email);
            helper.setSubject("Forgot Password");
            helper.setText(thymeleafService.getContent(dangKy,"ConfimNewUser"),true);
            mailSender.send(message);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ModelAndView mav = new ModelAndView("Login/register");
        return mav;
    }

    /*Xac nhan Dang ky  */
    @GetMapping("/confirmregister")
    public ModelAndView printConfirmRegister(){
        ModelAndView mav = new ModelAndView("Login/ConfirmRegister");
        return mav;
    }

    @PostMapping("/confirmregister")
    public ModelAndView printConfirmRegister(HttpServletRequest request){
        String sms = request.getParameter("sms");
        ModelAndView mav = new ModelAndView("Login/ConfirmRegister");
        return mav;
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

