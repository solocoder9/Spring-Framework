package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entities.Student;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the Student bean with ID "student" multiple times
        Student s1 = (Student) context.getBean("student");
        System.out.println(s1);

        // Retrieve another instance of the Student bean
        Student s2 = (Student) context.getBean("student");
        System.out.println(s2);

        // Check if both references point to different objects
        System.out.println("Are both beans the same instance? " + (s1 == s2));

        // Close the application context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
