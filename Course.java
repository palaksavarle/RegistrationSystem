package com.fourth;


public class Course {
    private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private String schedule;
    private int registeredStudents;

    // Constructor
    public Course(String courseCode, String title, String description, int capacity, String schedule) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.registeredStudents = 0;
    }

  

    public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public String getSchedule() {
		return schedule;
	}



	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}



	public int getRegisteredStudents() {
		return registeredStudents;
	}



	public void setRegisteredStudents(int registeredStudents) {
		this.registeredStudents = registeredStudents;
	}



	public boolean hasAvailableSlots() {
        return registeredStudents < capacity;
    }

    public void registerStudent() {
        if (hasAvailableSlots()) {
            registeredStudents++;
        } else {
            System.out.println("Course is already full.");
        }
    }

    public void removeStudent() {
        if (registeredStudents > 0) {
            registeredStudents--;
        } else {
            System.out.println("No students registered for this course.");
        }
    }

    @Override
    public String toString() {
        return courseCode + " - " + title + "\nDescription: " + description +
                "\nSchedule: " + schedule + "\nAvailable Slots: " + (capacity - registeredStudents);
    }



}