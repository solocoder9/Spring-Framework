package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	// Handles requests to "/home" URL and returns the "home" view
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping(path = "/google")
	public RedirectView redirectPage() {
		RedirectView redirect = new RedirectView();
		redirect.setUrl("https://www.google.com/");

		return redirect;
	}

}
