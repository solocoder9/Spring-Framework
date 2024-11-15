package com.test.entities;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope("singleton") // Optional, as singleton is the default scope
public class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
