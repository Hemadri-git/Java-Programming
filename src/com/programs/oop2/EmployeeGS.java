package com.programs.oop2;

public class EmployeeGS {

	private String name;
	private int age;
	private String department;
	private double salary;
	private String performance;
	
	public EmployeeGS(String name, int age, String department, double salary, String performance) {
		super();
		
		if (name == null || name == "") {
			System.err.println("Name cant be empty ");
		}
		this.name = name;
		
		if (age < 0) {
			System.err.println("Age cant be negative");
		}
		this.age = age;
		
		if (department == null || department == "") {
			System.err.println("Department cant be empty");
		}
		this.department = department;
		
		if (salary < 0) {
			System.err.println("Salary must be positive");
		}
		this.salary = salary;
		
		if (performance == null || performance == "") {
			System.err.println("performance cant be empty");
		}
		this.performance = performance;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	public double updateSalary() {
		if(this.performance == "good") {
			this.salary += 10000;
		}
		else if (this.performance == "average") {
			this.salary += 5000;
		}
		else if (this.performance == null || this.performance == "") {
			return salary;
		}
		
		return salary;
	}
	
	public void getupdateSalary() {
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.age);
		System.out.println("Department: "+ this.department);
		System.out.println("Salary: "+ this.salary);
		System.out.println("Performance: "+ this.performance);
	}
	
	
}
