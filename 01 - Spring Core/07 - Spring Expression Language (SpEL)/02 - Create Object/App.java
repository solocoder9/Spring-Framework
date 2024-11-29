package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entities.Demo;

public class App {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        // Retrieve the Demo bean
        Demo demo = context.getBean(Demo.class);
        
        // Print the created Person object
        System.out.println("Created Person: " + demo.getPerson()); // Outputs: Created Person: Person{name='Alice', age=30}
    }
}
