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
        
        // Print the stored numbers
        System.out.println("Stored Numbers: " + demo.getNumbers()); // Outputs: Stored Numbers: [1, 2, 3, 4, 5]
        
        // Print the first number
        System.out.println("First Number: " + demo.getFirstNumber()); // Outputs: First Number: 1
    }
}
