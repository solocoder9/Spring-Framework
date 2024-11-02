package com.test.entities;

public class Student {

	// Private fields
	private int studentID;
	private String studentName;
	private String studentEmail;

	// Default constructor
	public Student() {
		super();
	}

	// Parameterized constructor
	public Student(int studentID, String studentName, String studentEmail) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	// Getters and setters
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

}
