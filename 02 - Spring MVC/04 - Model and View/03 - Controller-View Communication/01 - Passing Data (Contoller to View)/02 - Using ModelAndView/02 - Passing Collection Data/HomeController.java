package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

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
		// Adding normal data
		model.addObject("ID", 101);
		model.addObject("Name", "Charlie");
		model.addObject("Email", "charlie15@gmail.com");

		// Adding collection data
		List<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Spring");
		courses.add("DevOps");
		model.addObject("Courses", courses);

		// Setting the view name to "home"
		model.setViewName("home");

		return model;
	}

}
