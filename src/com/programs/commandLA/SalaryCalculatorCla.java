package com.programs.commandLA;

public class SalaryCalculatorCla {

	public static void main(String[] args) {
		double basicSalary = Double.parseDouble(args[0]);
		double hra = 0.15 * basicSalary;
		double conveyanceAllowance = 0.15 * basicSalary;
		double entertainmentAllowance = 0.10 * basicSalary;
		double totalSalary = basicSalary + entertainmentAllowance + hra + conveyanceAllowance;
		System.out.println("Total salary : " + totalSalary);
	}

}
