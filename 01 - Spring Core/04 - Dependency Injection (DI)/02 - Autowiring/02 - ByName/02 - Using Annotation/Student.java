package com.test.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	// Private fields
	private int studentID;
	private String studentName;
	private String studentEmail;

	// Dependency: Course
	private Course course; // This property will be autowired

	@Autowired // Autowire the Course bean by name
	public Student(int studentID, String studentName, String studentEmail, Course course) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.course = course; // Injecting the Course dependency
	}

	// Override toString() to print the Student details
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", course=" + course + "]";
	}
}
