package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // Handles requests to "/home" URL and returns the "home" view
    // Demonstrates passing data from the controller to the view using ModelAndView
    @RequestMapping("/home")
    public ModelAndView home() {

        // Creating a ModelAndView object to hold both model data and view name
        ModelAndView model = new ModelAndView();

        // Adding attributes to the ModelAndView object
        model.addObject("ID", 101);
        model.addObject("Name", "Charlie");
        model.addObject("Email", "charlie15@gmail.com");

        // Setting the view name to "home"
        model.setViewName("home");

        return model;
    }

}
