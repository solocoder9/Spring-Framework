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
        
        // Print the square root value
        System.out.println("Square Root of 16: " + demo.getSquareRoot()); // Outputs: Square Root of 16: 4.0
        
        // Print the minimum integer value
        System.out.println("Minimum Integer Value: " + demo.getMinValue()); // Outputs: Minimum Integer Value: -2147483648
    }
}
