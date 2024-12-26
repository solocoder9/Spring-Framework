package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entity.User;

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

	// Handles form submission to "/createUser" URL with POST method
	// @ModelAttribute binds form data to the User object
	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user) {

		// Print the user object to the console
		System.out.println(user);

		return "register";
	}
}
