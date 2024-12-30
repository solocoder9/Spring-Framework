package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;

@Service // Marks this class as a Service component for business logic
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; // Injecting UserDao to access database operations

	// Method to register a user
	public int registerUser(User user) {
		// Calls the DAO layer to save user data in the database
		int i = userDao.saveUser(user);
		return i; // Returns result of the save operation (1 if successful)
	}
}
