package com.test.entities;

public class Course {
	private String courseID;
	private String courseName;

	// Default constructor
	public Course() {
	}

	// Parameterized constructor
	public Course(String courseID, String courseName) {
		this.courseID = courseID;
		this.courseName = courseName;
	}

	// Getters and Setters
	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", courseName=" + courseName + "]";
	}
}
