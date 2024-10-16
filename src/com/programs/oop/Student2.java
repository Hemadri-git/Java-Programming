package com.programs.oop;

public class Student2 {

	private int studentId;
    private	String studentName; 
	private int marks;
	private char grade;
	
	public void setStudentData(int studentId, String studentName, int marks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
	}
	
	public void calculateGrade(){
		
		if (this.marks > 90) {
			this.grade = 'A';
		}
		else if (this.marks > 80 && this.marks <=90) {
			this.grade = 'B';
		}
		else if (this.marks > 70 && this.marks <=80) {
			this.grade = 'C';
		}
		else if (this.marks > 60 && this.marks <=70) {
			this.grade = 'D';
		}
		else {
			this.grade = 'E';
		}
	}
	
	public String displayDetails() {
		return "Student [student Id=" + studentId + ", student Name=" + studentName + ", marks = "  + marks + ", grade = "
				+ grade + "]";
	}
}

