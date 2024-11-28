package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{T(java.lang.Math).sqrt(16)}")  // Using SpEL to invoke the static sqrt method
    private double squareRoot;

    @Value("#{T(java.lang.Integer).MIN_VALUE}")  // Accessing the static MIN_VALUE variable
    private int minValue;

    public double getSquareRoot() {
        return squareRoot;
    }

    public int getMinValue() {
        return minValue;
    }
}
