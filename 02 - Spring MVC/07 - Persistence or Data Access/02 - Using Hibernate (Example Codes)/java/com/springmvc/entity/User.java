package com.springmvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity // Marks this class as a entity for Hibernate ORM mapping
public class User {

	@Id // Primary key annotation
	@GeneratedValue(strategy = GenerationType.AUTO) // Automatically generate the primary key (ID)
	private int id;

	private String fullName;
	private String email;
	private String password;

	@Transient // This field is not persisted in the database (no column in DB)
	private String check;

	// Getters and setters for all fields
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + ", check="
				+ check + "]";
	}
}
