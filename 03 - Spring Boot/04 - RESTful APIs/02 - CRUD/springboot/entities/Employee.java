package com.springboot.entities;

public class Employee {

	private int id;
	private String name;
	private String job;

	public Employee(int id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

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
