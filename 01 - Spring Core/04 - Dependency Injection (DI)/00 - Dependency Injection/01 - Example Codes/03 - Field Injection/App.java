package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.test.entities.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Get bean by name (matching the @Component value)
		Student student1 = (Student) context.getBean("student1");

		System.out.println(student1);
	}
}
