package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entities.Student;

public class App {
    public static void main(String[] args) {

        // Load the Spring application context from the specified XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the Student bean with ID "student1" from the application context
        Student s1 = (Student) context.getBean("student1");

        // Print the details of the student
        System.out.println(s1);

        // Close the application context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
