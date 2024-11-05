package com.test.entities;

public class Course {
	
	// Private fields
    private String courseName;

    // Constructor to initialize courseName
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Override toString() to print the Course details
    @Override
    public String toString() {
        return "Course [courseName=" + courseName + "]";
    }
}
