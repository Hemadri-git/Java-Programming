package com.programs.oop;

public class Employee4 {

	public int employeeNumber;
	public String employeeName;
	public double employeeSalary;
	
	
	public Employee4(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
		if (this.employeeNumber < 0) {
			this.employeeNumber = 0;
			System.err.println(" Id must be always must be always positive...");
		}
		else if (this.employeeSalary < 0) {
			this.employeeSalary = 0;
			System.err.println("Salary cannot be negative...");
		}
		else if (this.employeeName == null ) {
			this.employeeName = "";
			System.err.println("name must initialize with any default name");
		}
		
	}
	
	
	
	
}
