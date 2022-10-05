package org.examp.Controllers;

import org.examp.Model.DangKy;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;

@RestController
@RequestMapping("/admin")
public class AdminController {

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
}
