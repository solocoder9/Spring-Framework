package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entities.Student;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the Student bean with ID "student1"
        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);

        // Retrieve the same Student bean again to demonstrate singleton behavior
        Student s2 = (Student) context.getBean("student1");
        System.out.println(s2);

        // Check if both references point to the same object
        System.out.println("Are both beans the same instance? " + (s1 == s2));

        // Close the application context
        ((ClassPathXmlApplicationContext) context).close();
    }
}


/**
Output: 
Student [studentID=101, studentName=Charlie, studentEmail=charlie15@gmail.com]
Student [studentID=101, studentName=Charlie, studentEmail=charlie15@gmail.com]
Are both beans the same instance? true
*/
