package com.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // Marks this class as a JPA entity
public class Employee {

	@Id // Primary key
	private int id; // Employee ID
	private String name; // Employee name
	private String job; // Employee job role

	// Parameterized constructor
	public Employee(int id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
	}

	// Default constructor (required by JPA)
	public Employee() {
		super();
	}

	// Getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}