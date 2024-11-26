package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.test.entities.Student;

@Configuration
public class App {

    public static void main(String[] args) {
        // Load the application context
        ApplicationContext context = new AnnotationConfigApplicationContext(Student.class);

        // Retrieve the Student bean
        Student student = context.getBean(Student.class);

        // Print student details
        System.out.println(student);

        // Close the application context
        ((AnnotationConfigApplicationContext) context).close();
    }
}
