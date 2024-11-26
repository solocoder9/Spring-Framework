package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    // Injecting direct values using @Value
    @Value("101")                // Direct integer value
    private int studentID;

    @Value("Charlie")           // Direct string value
    private String studentName;

    @Value("charlie15@gmail.com") // Direct string value
    private String studentEmail;

    // Default constructor
    public Student() {}

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail + "]";
    }
}
