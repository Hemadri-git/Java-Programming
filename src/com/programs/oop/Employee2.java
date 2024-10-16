package com.programs.oop;

public class Employee2 {

	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public void setEmployeeData(String firstName, String lastName, int employeeId, double salary,  int noOfProject) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
		calculateSalary();
		
	}
	
	public void calculateSalary() {
		if (this.noOfProject > 5 && this.noOfProject <= 10) {
			this.salary += 5000;
		}
		else if (this.noOfProject > 10 && this.noOfProject <= 20) {
			this.salary += 10000;
		}
		else if (this.noOfProject > 20) {
			this.salary += 15000;
		}
		else {
			System.out.println("No Hike!!");
  		}
	}

	
	public String displayDetails() {
		return "Employee"
			    + " [first Name = " + firstName + ", last Name = " + lastName + ", employee Id = " + employeeId
				+ ", salary = " + salary + ", no Of Projects = " + noOfProject + "]";
	}
	
	
}

