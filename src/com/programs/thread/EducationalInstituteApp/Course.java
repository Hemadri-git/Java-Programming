package com.programs.thread.EducationalInstituteApp;

public class Course 
{
	private int CourseId;
	private String courseName;
	private double courseFee;
	
	public Course(int courseId, String courseName, double courseFee) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public int getCourseId() {
		return CourseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}

}
