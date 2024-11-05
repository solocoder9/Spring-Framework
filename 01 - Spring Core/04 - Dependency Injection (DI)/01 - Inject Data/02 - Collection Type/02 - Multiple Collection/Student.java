package com.test.entities;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Student {

    // Private fields
    private int studentID;
    private String studentName;
    private List<String> studentEmails;  // List for multiple email addresses
    private Set<String> studentCourses;   // Set for unique courses
    private Map<String, Integer> studentGrades; // Map for grades by subject
    private Properties studentProperties; // Properties for key-value pairs

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

    public List<String> getStudentEmails() {
        return studentEmails;
    }

    public void setStudentEmails(List<String> studentEmails) {
        this.studentEmails = studentEmails;
    }

    public Set<String> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<String> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Map<String, Integer> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(Map<String, Integer> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Properties getStudentProperties() {
        return studentProperties;
    }

    public void setStudentProperties(Properties studentProperties) {
        this.studentProperties = studentProperties;
    }

    // Override toString() to print the Student details
    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName +
                ", studentEmails=" + studentEmails +
                ", studentCourses=" + studentCourses +
                ", studentGrades=" + studentGrades +
                ", studentProperties=" + studentProperties + "]";
    }
}
