package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	// Handles requests to "/home" URL and returns the "home" view
    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    // Handles requests to "/login" URL and returns the "login" view
    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
}
