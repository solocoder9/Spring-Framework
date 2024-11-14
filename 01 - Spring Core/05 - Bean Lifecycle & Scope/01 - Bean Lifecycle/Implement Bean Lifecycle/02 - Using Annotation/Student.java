package com.test.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

    // Private fields
    private int studentID;
    private String studentName;
    private String studentEmail;

    // Parameterized constructor
    public Student(int studentID, String studentName, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail + "]";
    }

    // Initialization method using @PostConstruct
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: Student " + studentName + " is initialized.");
    }

    // Destruction method using @PreDestroy
    @PreDestroy
    public void cleanup() {
        System.out.println("@PreDestroy: Student " + studentName + " is being destroyed.");
    }
}
