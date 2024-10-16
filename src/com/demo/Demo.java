package com.demo;

import java.util.Scanner;

public class Demo{
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Demo(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	public static Demo getEmployeeObject() {
		
		Scanner scanner = new Scanner(System.in);
		
		int employeeId;
		String employeeName;
		double employeeSalary;
		
		while(true) {
			System.out.println("Enter Employee Id : ");
			employeeId = scanner.nextInt();
			
			if (employeeId > 0) {
				break;
			}
			System.out.println("Invalid Input!! Id can't be negative Enter positive number..");
		}
		
		scanner.nextLine();
		while(true) {
			System.out.println("Enter Employee Name: ");
			employeeName = scanner.nextLine();
			
			if(!employeeName.trim().isEmpty()) {
				break;
			}
			System.out.println("Invalid input!! Name cant be empty..");
		}
		
		while(true) {
			System.out.println("Enter Employee Salary: ");
			employeeSalary = scanner.nextDouble();
			
			if (employeeSalary > 0) {
				break;
			}
			System.out.println("Invalid Input!! Salary must be positive..");
		}
		System.out.println();
		return new Demo(employeeId, employeeName, employeeSalary);
				
		
	}


	@Override
	public String toString() {
		return "Demo [Id=" + employeeId + ", Name=" + employeeName + ", Salary="
				+ employeeSalary + "]";
	}
	
	
	
}