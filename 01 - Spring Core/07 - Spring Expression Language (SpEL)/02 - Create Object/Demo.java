package com.test.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{new com.test.entities.Person('Alice', 30)}") // Creating a Person object using SpEL
    private Person person;

    public Person getPerson() {
        return person;
    }
}
