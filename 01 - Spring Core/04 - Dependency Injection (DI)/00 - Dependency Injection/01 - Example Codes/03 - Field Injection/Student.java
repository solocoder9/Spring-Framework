package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")  // Give the bean an explicit name (optional)
public class Student {

	@Value("101")  // Inject value directly into field
	private int studentID;

	@Value("Charlie")
	private String studentName;

	@Value("charlie15@gmail.com")
	private String studentEmail;

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail + "]";
	}
}
