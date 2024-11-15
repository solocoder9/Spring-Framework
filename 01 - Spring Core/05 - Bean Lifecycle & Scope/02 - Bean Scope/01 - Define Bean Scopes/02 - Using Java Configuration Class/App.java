package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.AppConfig;
import com.test.entities.Student;

public class App {
    public static void main(String[] args) {
        // Create the application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Retrieve the Student bean
        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);

        // Check if both references point to the same instance
        System.out.println("Are both student instances the same? " + (student1 == student2)); // Should print 'true'
        System.out.println("Student Name: " + student1.getName()); // Print the name of the student
    }
}
