package org.examp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class UserController {


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
    @GetMapping(value = "/blog")
    public ModelAndView printBlog(Model model){
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
}
