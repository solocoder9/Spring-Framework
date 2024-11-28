package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("Charlie")  // Using @Value to set the student name
    private String studentName;

    public String getStudentName() {
        return studentName;
    }
}
