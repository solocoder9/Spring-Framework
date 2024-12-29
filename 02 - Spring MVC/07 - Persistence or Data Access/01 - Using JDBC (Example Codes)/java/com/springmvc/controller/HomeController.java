package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService; // Injecting UserService to access business logic

	// Handles the "/home" URL, returns the homepage view
	@RequestMapping("/home")
	public String home() {
		return "home"; // Returns "home" view (HTML/JSP page)
	}

	// Handles the "/register" URL, returns the registration form view
	@RequestMapping("/register")
	public String register() {
		return "register"; // Returns "register" view (registration form page)
	}

	// Handles POST request to "/createUser" for form submission
	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, Model m) {
		
		// Calls the UserService to register the user (save data to DB)
		userService.registerUser(user);

		// Pass the user object to the "success" view (used for displaying user info)
		m.addAttribute("user", user);

		// Return the success view after registration is complete
		return "success"; // Redirects to "success" view (confirmation page)
	}
}
