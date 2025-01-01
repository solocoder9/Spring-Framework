package com.springmvc.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.User;

@Repository // Marks this as a DAO class for database interaction
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate; // HibernateTemplate used to perform CRUD operations

	// Method to save user data in the database
	@Transactional // Ensures that the method runs within a transaction context
	public int save(User user) {
		// Save the user entity to the database and return the generated ID (primary key)
		int i = (Integer) hibernateTemplate.save(user);
		return i; // Return the generated user ID
	}
}
