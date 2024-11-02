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

	// Getters and Setters
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

	// Override toString() to print the Student details
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ "]";
	}

}
