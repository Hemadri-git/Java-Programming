package com.programs.oop;

public class Student {
	
	String name;
	int age;
	int rollNo;
	
	public void setStudent(String s_name, int s_age, int S_rollNo) {
		
		name = s_name;
		age = s_age;
		rollNo = S_rollNo;
		
	}

	public void getStudent() {
		System.out.println("Student name is : "+ name);
		System.out.println("Student Age is : "+ age);
		System.out.println("Student RollNo is "+ rollNo);
		System.out.println("--------------------------------");
		
	}
}
