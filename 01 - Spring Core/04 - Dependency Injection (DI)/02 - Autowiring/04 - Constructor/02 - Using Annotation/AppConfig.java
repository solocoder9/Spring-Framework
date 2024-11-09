package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.entities.Course;
import com.test.entities.Student;

@Configuration
@ComponentScan(basePackages = "com.test.entities") // Scans for components in the specified package
public class AppConfig {

    @Bean // Create Course bean with a specific name
    public Course course() {
        return new Course("Computer Science"); // Setting the course name
    }

    @Bean // Create Student bean
    public Student student() {
        return new Student(101, "Charlie", "charlie15@gmail.com", course()); // Injecting the Course bean
    }
}
