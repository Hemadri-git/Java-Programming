package com.programs.oop2;

public class Student {

	private String name;
	private int id;
	private String course;
	private double fee;
	private char grade;
	private double average;
	
	
	public Student(String name, int id, String course, double fee) 
	{
		super();
		this.name = name;
		this.id = id;
		this.course = course;
		this.fee = fee;
		this.grade = 'U';
		this.average = 0.0;
	}
	
	public Student(Student student) {
		this.name = student.name;
		this.id = student.id;
		this.course = student.course;
		this.fee = student.fee;
		this.grade = student.grade;
		this.average = student.average;
	}
	
	public char calculateGrade(double average) {
		
		this.average = average;
		
	    if (average < 0 || average > 100) {
			System.err.println("Error: Average mark must be between 0 and 100.");
		}
	    else if (average >= 90) {
			grade = 'A';
		}
	    else if (average >= 80) {
			grade = 'B';
		}
	    else if (average >= 70) {
	    	grade = 'C';
	    }
	    else if (average >= 60) {
	    	grade = 'D';
	    }
	    else if (average < 60) {
	    	grade = 'F';
	    }
	    
	    return grade;
	}
	
	public String toString() {
		return "Grade for Average " + this.average + " : " + this.grade ;
	}
}
