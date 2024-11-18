package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.test.entities.Course;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Retrieve the Course bean
        Course course = (Course) context.getBean("course");

        // Print the details of the course
        System.out.println(course);

        // Close the application context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
