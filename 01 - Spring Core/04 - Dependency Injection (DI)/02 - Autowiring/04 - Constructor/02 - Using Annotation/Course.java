package com.test.entities;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String courseName;

    // Parameterized constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + "]";
    }
}
