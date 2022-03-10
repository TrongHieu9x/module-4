package com.example.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class GreetingController {

    @GetMapping("/greeting")
    public ModelAndView showGreeting(){
        return new ModelAndView("greeting");
    }
}
