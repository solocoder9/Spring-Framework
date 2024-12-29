package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.User;

@Repository // Marks this as a DAO component for database interaction
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate; // Used for executing SQL queries

	// Method to save a user to the database
	public int saveUser(User user) {
		// SQL query to insert user data into the database
		String sql = "INSERT INTO user(name, email, password) values(?, ?, ?)";
		// Executes the insert query with user data
		int i = jdbcTemplate.update(sql, user.getFullName(), user.getEmail(), user.getPassword());
		return i; // Returns number of rows affected (1 if successful)
	}
}
