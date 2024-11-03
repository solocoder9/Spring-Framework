package com.test.entities;

import java.util.Map;

public class Student {

    // Private fields
    private int studentID;
    private String studentName;
    private Map<String, String> studentEmails; // Map to hold email types and addresses

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

    public Map<String, String> getStudentEmails() {
        return studentEmails;
    }

    public void setStudentEmails(Map<String, String> studentEmails) {
        this.studentEmails = studentEmails;
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmails=" + studentEmails + "]";
    }
}
