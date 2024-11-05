package com.test.entities;

public class Student {
	
    // Private fields
    private int studentID;
    private String studentName;
    private Course course; // Reference to a Course object

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", course=" + course + "]";
    }
}
