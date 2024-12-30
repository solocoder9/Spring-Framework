package com.springmvc.service;

import com.springmvc.entity.User;

// Interface defining user-related business operations
public interface UserService {

	// Method to register a new user
	public int registerUser(User user);
}
