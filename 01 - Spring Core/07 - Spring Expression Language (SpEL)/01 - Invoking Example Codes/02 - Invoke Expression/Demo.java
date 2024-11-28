package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{10 + 20}")  // Using SpEL to evaluate a simple addition expression
    private int sum;

    @Value("#{100 - 30}") // Using SpEL to evaluate a subtraction expression
    private int difference;

    @Value("#{2 * 5}")     // Using SpEL to evaluate a multiplication expression
    private int product;

    @Value("#{20 / 4}")     // Using SpEL to evaluate a division expression
    private int quotient;

    public int getSum() {
        return sum;
    }

    public int getDifference() {
        return difference;
    }

    public int getProduct() {
        return product;
    }

    public int getQuotient() {
        return quotient;
    }
}
