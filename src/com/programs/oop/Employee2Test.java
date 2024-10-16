package com.programs.oop;

public class Employee2Test {

	public static void main(String[] args) {
		
		Employee2 emp1 = new Employee2();
		
		emp1.setEmployeeData("Hemadri", "Bathula", 1270, 50000, 23);
		System.out.println(emp1.displayDetails());
		
        Employee2 emp2 = new Employee2();
		
		emp2.setEmployeeData("Yamuna", "thamisetty", 1211, 100000, 6);
		System.out.println(emp2.displayDetails());
		
		
	}
}
