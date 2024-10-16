package com.programs.oop;

public class Employee {
	
    String name;
    String company;
    int salary;
    int Id;
    
    public Employee(String e_name, String e_company, int e_salary, int e_Id) {
    	this.name = e_name;
    	this.company = e_company;
    	this.salary = e_salary;
    	this.Id = e_Id;
    }
    
    public void getEmployeeDetails() {
    	System.out.println("Name is : "+ name);
    	System.out.println("Company is : "+ company);
    	System.out.println("Salary is : "+ salary);
    	System.out.println("Employee Id is : " + Id);
    	System.out.println("--------------------------------------");
		
	}

}
