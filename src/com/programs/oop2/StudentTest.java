package com.programs.oop2;

public class StudentTest {

	public static void main(String[] args) {
	
		Student student = new Student("hema", 101,"It" , 1200);
		student.calculateGrade(99);
//		System.out.println(student);
		
		Student st2 = new Student(student);
		System.out.println(st2);
				
		
	}
}
