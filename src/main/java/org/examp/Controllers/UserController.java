package org.examp.Controllers;

import org.examp.Model.Blog_ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
}
