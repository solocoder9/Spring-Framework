package com.test.entities;

public class Student {
	
	// Private fields
    private int studentID;
    private String studentName;
    private String studentEmail;
    
    // Dependency: Course
    private Course course; // Property to be injected

    // Parameterized constructor with Course dependency
    public Student(int studentID, String studentName, String studentEmail, Course course) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.course = course; // Injecting Course via constructor
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName +
               ", studentEmail=" + studentEmail + ", course=" + course + "]";
    }
}
