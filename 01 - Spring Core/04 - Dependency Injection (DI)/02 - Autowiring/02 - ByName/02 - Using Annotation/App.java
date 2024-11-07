package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.config.AppConfig;
import com.test.entities.Student;

public class App {
	public static void main(String[] args) {
		// Load the Spring application context using the configuration class
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve the Student bean from the application context
		Student student = context.getBean(Student.class);

		// Print student details
		System.out.println(student);

		// Close the application context
		((ConfigurableApplicationContext) context).close();
	}
}
