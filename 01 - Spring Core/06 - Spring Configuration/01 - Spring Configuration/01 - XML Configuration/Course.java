package com.test.entities;

public class Course {
	
	// Private fields
    private String courseName;
    private Student student;

    // Constructor
    public Course(String courseName, Student student) {
        this.courseName = courseName;
        this.student = student;
    }

    // Override toString() to print Course details
    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", student=" + student + "]";
    }
}
