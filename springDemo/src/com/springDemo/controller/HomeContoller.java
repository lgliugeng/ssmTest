package com.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeContoller {

    @RequestMapping(value = "/getHome")
    public String getHome(ModelAndView modelAndView){
        return "home";
    }
}
