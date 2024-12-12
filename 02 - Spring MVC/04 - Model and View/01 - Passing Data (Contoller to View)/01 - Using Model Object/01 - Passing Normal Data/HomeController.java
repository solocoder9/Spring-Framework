package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// Passing data from controller to view using Model
	// Handles requests to "/home" URL and returns the "home" view
	@RequestMapping("/home")
	public String home(Model m) {
		
		// Adding attributes to the model object
		m.addAttribute("ID", 101);
		m.addAttribute("Name", "Charlie");
		m.addAttribute("Email", "charlie15@gmail.com");
		
		return "home";
	}

}
