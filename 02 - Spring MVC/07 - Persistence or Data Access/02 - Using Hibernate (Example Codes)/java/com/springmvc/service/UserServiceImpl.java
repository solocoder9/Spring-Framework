package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.entity.User;

@Service // Marks this class as a Service component containing business logic
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; // Injecting UserDao to interact with the database

	// Implement the saveUser method from the interface
	public int saveUser(User user) {
		
		// Call the DAO method to save user details into the database
		int i = userDao.save(user);
		
		return i; // Return the result of the save operation (user ID)
	}
}
