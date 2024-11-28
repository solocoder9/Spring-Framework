package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Demo {

    @Value("#{{1, 2, 3, 4, 5}}") // Using SpEL to define a list of numbers
    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Integer getFirstNumber() {
        return numbers.get(0); // Get the first number from the list
    }
}
