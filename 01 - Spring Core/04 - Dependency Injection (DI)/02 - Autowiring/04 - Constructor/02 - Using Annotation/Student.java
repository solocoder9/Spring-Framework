package com.test.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int studentID;
    private String studentName;
    private String studentEmail;
    private Course course; // Dependency

    // Constructor with Course dependency
    @Autowired // Constructor injection for Course
    public Student(int studentID, String studentName, String studentEmail, Course course) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.course = course; // Injecting the Course dependency
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName +
               ", studentEmail=" + studentEmail + ", course=" + course + "]";
    }
}
