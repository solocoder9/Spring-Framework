package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entities.Student;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context from the specified XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the Student bean from the application context
        Student student = (Student) context.getBean("student");

        // Print student details
        System.out.println(student);
    }
}
