package com.test.entities;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Student implements InitializingBean, DisposableBean {

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

    // Implementation of InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean: Student " + studentName + " is initialized.");
    }

    // Implementation of DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean: Student " + studentName + " is being destroyed.");
    }
}
