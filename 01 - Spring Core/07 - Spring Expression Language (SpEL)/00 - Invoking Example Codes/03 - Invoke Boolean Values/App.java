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
        
        // Print the boolean values
        System.out.println("Is Active: " + demo.isActive()); // Outputs: Is Active: true
        System.out.println("Is Greater Than Zero: " + demo.isGreaterThanZero()); // Outputs: Is Greater Than Zero: true
    }
}
