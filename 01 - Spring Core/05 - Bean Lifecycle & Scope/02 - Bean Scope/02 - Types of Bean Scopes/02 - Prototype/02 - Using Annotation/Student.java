package com.test.entities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // This indicates that this bean is prototype-scoped
public class Student {
    private int studentID;
    private String studentName;
    private String studentEmail;

    // Parameterized constructor
    public Student(int studentID, String studentName, String studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail + "]";
    }
}
