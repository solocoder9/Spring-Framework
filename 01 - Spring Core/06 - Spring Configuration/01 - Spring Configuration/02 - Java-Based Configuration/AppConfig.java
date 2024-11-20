package com.test.config;

import com.test.entities.Course;
import com.test.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Indicates that this class contains Spring configuration
public class AppConfig {

    @Bean // Defines a bean for Student
    public Student student() {
        return new Student(101, "Charlie", "charlie15@gmail.com");
    }

    @Bean // Defines a bean for Course, injecting the Student bean
    public Course course() {
        return new Course("Mathematics", student()); // Injecting the student bean
    }
}
