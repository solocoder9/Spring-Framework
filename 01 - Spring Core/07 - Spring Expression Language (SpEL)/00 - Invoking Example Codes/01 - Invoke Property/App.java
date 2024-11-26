package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.test.entities.Student;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        // Retrieve the Student bean
        Student student = context.getBean(Student.class);
        
        // Print the student name
        System.out.println("Student Name: " + student.getStudentName()); // Outputs: Student Name: Charlie
    }
}
