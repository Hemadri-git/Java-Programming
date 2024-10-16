package com.programs.oop;

public class Student2Test {

	public static void main(String[] args) {
		
		Student2 student1 = new Student2();
		Student2 student2 = new Student2();
		
		student1.setStudentData(1270, "hemadri", 94);
		System.out.println(student1.displayDetails());
		
		student2.setStudentData(1211, "yamuna", 78);
		System.out.println(student2.displayDetails());

	}
}
