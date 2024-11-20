package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.AppConfig;
import com.test.entities.Course;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context using component scanning
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the Course bean from the context
        Course course = (Course) context.getBean(Course.class);

        // Print the details of the course
        System.out.println(course);

        // Close the application context
        ((AnnotationConfigApplicationContext) context).close();
    }
}
