package com.programs.oop2;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Employee[] employee = new Employee[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter Details for Employee " + (i+1) + " : ");
			System.out.println("-------------------------------------------");
			employee[i] = Employee.getEmployeeObject();
		}
		
		for(int i = 0; i < 5; i++) {
		     System.out.println(employee[i].toString());
		}
		
        scanner.close();

	}
}
