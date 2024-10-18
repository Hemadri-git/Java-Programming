package com.programs.oop2;

public class StudentTest {

	public static void main(String[] args) {
	
		Student student = new Student("Hemadri", 1211, "IT", 10000);
		student.calculateGrade(97);
//		System.out.println(student);
		
		Student student2 = new Student(student);
		student2.calculateGrade(67);
		System.out.println(student2);
	}
}
