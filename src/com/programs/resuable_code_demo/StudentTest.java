package com.programs.resuable_code_demo;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Roll Number : ");
		int roll = scanner.nextInt();
		
		System.out.println("Enter name : ");
		String name = scanner.nextLine();
		name = scanner.nextLine();
		
		System.out.println("Enter your College fee : ");
		double fee = scanner.nextDouble();
		
		String studentDetails = Student.getStudentDetails(roll, name, fee);
		System.out.println("Student Details: " + studentDetails);
		
		scanner.close();
		
	}

}
