package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{true}") // Using SpEL to set a boolean value
    private boolean isActive;

    @Value("#{1 > 0}") // Using SpEL to evaluate a boolean expression
    private boolean isGreaterThanZero;

    public boolean isActive() {
        return isActive;
    }

    public boolean isGreaterThanZero() {
        return isGreaterThanZero;
    }
}
