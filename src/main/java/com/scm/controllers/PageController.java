package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("home page handler");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("about page loading");
        return "about";
    }

    @RequestMapping("/services")
    public String servicexPage(){
        System.out.println("services page loading");
        return "services";
    }

    @RequestMapping("/contact")
    public String contactPage(){
        System.out.println("contact page loading");
        return "contact";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/signup")
    public String signup(){
        return new String("signup");
    }



}
