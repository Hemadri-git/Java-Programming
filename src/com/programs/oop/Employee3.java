package com.programs.oop;

public class Employee3 
{

	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProjects;
	

	public Employee3(String firstName, String lastName, int employeeId, double salary, int noOfProjects)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProjects = noOfProjects;
		calculateSalary();
	}
	
	public void calculateSalary() 
	{
		if (this.noOfProjects < 0) {
			System.err.println("Can't be Negative!!");
		}
		else if (this.noOfProjects > 5 && this.noOfProjects <=10) {
			this.salary += 5000;
		}
		else if (this.noOfProjects > 10 && this.noOfProjects <=20) {
			this.salary += 10000;
		}
		else if (this.noOfProjects > 20) {
			this.salary += 15000;
		}
	}
	
	@Override
	public String toString() 
	{
		return "Employee3 [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProjects=" + noOfProjects + "]";
	}


}
