package com.springmvc.service;

import com.springmvc.entity.User;

// Interface defining business logic for user-related operations
public interface UserService {

	// Method to save a user to the database
	public int saveUser(User user);
}
