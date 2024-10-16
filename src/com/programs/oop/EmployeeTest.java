package com.programs.oop;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Hemadri", "Google", 1000000, 1270);
		Employee employee2 = new Employee("Yamuna", "Microsoft", 500000, 1211);
		
		employee1.getEmployeeDetails();
		employee2.getEmployeeDetails();

		
	}
}
