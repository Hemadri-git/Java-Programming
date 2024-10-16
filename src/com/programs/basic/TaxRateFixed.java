package com.programs.basic;

public class TaxRateFixed {

	public static void main(String[] args) {
		double taxableIncome = 990000;
		double taxRate = 4.9 / 100; 

		double tax = taxableIncome * taxRate;

		System.out.printf("The tax on a taxable income of ₹%.2f at a tax rate of 4.9%% is ₹%.2f", taxableIncome, tax);
	}

}
