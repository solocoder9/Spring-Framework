package com.test.entities;

import java.util.Properties;

public class Student {

    // Private fields
    private int studentID;
    private String studentName;
    private Properties studentEmails; // Properties to hold email types and addresses

    // Default constructor
    public Student() {
        super();
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Properties getStudentEmails() {
        return studentEmails;
    }

    public void setStudentEmails(Properties studentEmails) {
        this.studentEmails = studentEmails;
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmails=" + studentEmails + "]";
    }
}
