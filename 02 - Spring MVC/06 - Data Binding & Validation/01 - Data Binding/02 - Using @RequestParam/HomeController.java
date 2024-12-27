package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	// Handles requests to "/home" URL and returns the "home" view
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	// Handles requests to "/register" URL and returns the "register" view
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	// Handles POST requests to "/createUser" URL for form submission
	// @RequestParam binds the form parameter "fullName" to the method's parameter
	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@RequestParam("fullName") String fullName) {

		// Prints the full name from the form submission to the console
		System.out.println("Full Name: " + fullName);

		return "register";
	}
}
