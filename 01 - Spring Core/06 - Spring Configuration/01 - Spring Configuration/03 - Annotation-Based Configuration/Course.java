package com.test.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring-managed component
public class Course {
	
    // Private fields
    private String courseName;
    private Student student;

    // Constructor with @Autowired to inject the Student bean
    @Autowired
    public Course(Student student) {
        this.courseName = "Mathematics"; // default value
        this.student = student;
    }

    // Override toString() to print Course details
    @Override
    public String toString() {
        return "Course [courseName=" + courseName + ", student=" + student + "]";
    }
}
