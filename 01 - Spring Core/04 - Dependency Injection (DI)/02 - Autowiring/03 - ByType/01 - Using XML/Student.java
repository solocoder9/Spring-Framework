package com.test.entities;

public class Student {
	
	// Private fields
    private int studentID;
    private String studentName;
    private String studentEmail;
    
    // Dependency: Course
    private Course course; // Property to be autowired

    // Parameterized constructor
    public Student(int studentID, String studentName, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    // Setter for Course to be injected by Spring
    public void setCourse(Course course) {
        this.course = course; // Setter for autowiring
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName +
               ", studentEmail=" + studentEmail + ", course=" + course + "]";
    }
}
