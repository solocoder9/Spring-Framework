package com.test.entities;

public class Student {

    // Private fields
    private int studentID;
    private String studentName;
    private String studentEmail;

    // Default constructor
    public Student() {
        super();
    }

    // Setter methods for dependency injection
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail + "]";
    }
}
