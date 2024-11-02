package com.test.entities;

public class Student {

	// Private fields
	private int studentID;
	private String studentName;
	private String studentEmail;

	// Parameterized constructor
	public Student(int studentID, String studentName, String studentEmail) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	// Override toString() to print the Student details
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ "]";
	}

}
