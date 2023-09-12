package com.github.joellhss.challengeoftheweekivcompass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {
    @RequestMapping("/**")
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }
}
