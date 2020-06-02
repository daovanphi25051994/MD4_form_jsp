package com.codegym.controller;

import com.codegym.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping()
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public ModelAndView moveLoginPage(){
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("login", new Login());
        return modelAndView;
    }

}
