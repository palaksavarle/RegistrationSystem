package com.fourth;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private List<Course> registeredCourses;

    // Constructor
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

   

    public int getStudentID() {
		return studentID;
	}



	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}



	public void setRegisteredCourses(List<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}



	public void registerForCourse(Course course) {
        if (registeredCourses.contains(course)) {
            System.out.println("You are already registered for this course.");
        } else if (course.hasAvailableSlots()) {
            registeredCourses.add(course);
            course.registerStudent();
            System.out.println("Registration successful for course: " + course.getTitle());
        } else {
            System.out.println("Course is already full. Registration failed.");
        }
    }

    public void dropCourse(Course course) {
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(course);
            course.removeStudent();
            System.out.println("Dropped course: " + course.getTitle());
        } else {
            System.out.println("You are not registered for this course.");
        }
    }

    public void displayRegisteredCourses() {
        System.out.println("Registered courses for " + name + ":");
        for (Course course : registeredCourses) {
            System.out.println(course.getTitle());
        }
    }
}