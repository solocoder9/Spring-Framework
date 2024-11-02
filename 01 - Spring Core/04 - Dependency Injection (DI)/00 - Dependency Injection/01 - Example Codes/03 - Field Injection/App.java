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

		// Retrieve the Student bean with ID "student2" from the application context
		Student s2 = (Student) context.getBean("student2");

		// Print the details of the first student
		System.out.println(s1);

		// Print the details of the second student
		System.out.println(s2);
	}
}
