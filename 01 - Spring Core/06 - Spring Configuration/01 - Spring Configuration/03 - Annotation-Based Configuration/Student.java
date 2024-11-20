package com.test.entities;

import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring-managed component
public class Student {
	
    // Private fields
    private int studentID;
    private String studentName;
    private String studentEmail;

    // Parameterized constructor
    public Student() {
        this.studentID = 101; // default value
        this.studentName = "Charlie"; // default value
        this.studentEmail = "charlie15@gmail.com"; // default value
    }

    // Override toString() to print Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail + "]";
    }
}
