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
        
        // Print the results of the evaluated expressions
        System.out.println("Sum of 10 + 20: " + demo.getSum());          // Outputs: Sum of 10 + 20: 30
        System.out.println("Difference of 100 - 30: " + demo.getDifference()); // Outputs: Difference of 100 - 30: 70
        System.out.println("Product of 2 * 5: " + demo.getProduct());   // Outputs: Product of 2 * 5: 10
        System.out.println("Quotient of 20 / 4: " + demo.getQuotient()); // Outputs: Quotient of 20 / 4: 5
    }
}
