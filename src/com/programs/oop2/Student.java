package com.programs.oop2;

public class Student {

	private String name;
	private int id;
	private String course;
	private double fee;
	private char grade;
	private double average;
	
	
	public Student(String name, int id, String course, double fee) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
		this.fee = fee;
		this.grade = 'u';
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
		
		double avg = average;
		
		if (avg < 0 || avg >100) {
			System.err.println("Error: Average mark must be between 0 and 100.");
		}
		else if (avg > 90 ) {
			grade = 'A';
		}
		else if (avg >= 80) {
			grade = 'B';
		}
		else if (avg >= 70) {
			grade = 'C';
		}
		else if (avg >= 60) {
			grade = 'D';
		}
		else if (avg < 60) {
			grade = 'F';
		}
		return grade;
	}
	
	public String toString() {
		return "Grade for average "+ this.average + " : " + this.grade; 
	}
	
}
