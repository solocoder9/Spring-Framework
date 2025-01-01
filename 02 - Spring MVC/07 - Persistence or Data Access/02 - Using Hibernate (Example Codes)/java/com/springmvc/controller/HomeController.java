package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;

@Controller // Marks this as a Controller component in Spring MVC
public class HomeController {

	@Autowired
	private UserService userService;

	// Handles GET request to the "/home" URL and returns the "home" view (home.jsp)
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	// Handles GET request to "/register" URL and returns the registration form view
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	// Handles POST request to "/createUser" for user registration
	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, Model m) {
		// Call the service layer to save the user details
		userService.saveUser(user);

		// Redirect to success page after successful registration
		return "success";
	}
}
