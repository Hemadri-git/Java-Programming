package com.programs.oop2;

import java.util.Scanner;

public class Employee 
{

	private  int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public static Employee getEmployeeObject() 
	{
		Scanner sc = new Scanner(System.in);
		
		int employeeId;
		String employeeName;
		double employeeSalary;
		
		while (true) {
			System.out.print("Enter Employee Id: ");
			employeeId = sc.nextInt();
			
			if (employeeId >= 0) {
				break;
			}
			System.out.print("Invalid Input! ID must be postive");
		}
		
		sc.nextLine();
		while (true) {
			System.out.print("Enter Employee Name: ");
			employeeName = sc.nextLine();
			
			if (!employeeName.trim().isEmpty()) {
				break;
			}
			System.out.println("Invalid Input! Name must be initialize.");
		}
		
		while (true) {
			System.out.print("Enter Employee Salary: ");
			employeeSalary = sc.nextDouble();
			
			if (employeeSalary >= 0) {
				break;
			}
			System.out.println("Invalid Input! salary can't be negative.");
		}
		
		System.out.println();

          return new Employee(employeeId, employeeName,employeeSalary);
		
	}

	@Override
	public String toString() {
		return "Employee [ ID = " + employeeId + ",  Name = " + employeeName + ",  Salary = " + employeeSalary + "]";
	}
	
	
}
