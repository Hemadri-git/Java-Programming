package com.programs.oop;

public class Loan {
	
	private double principal;
	private double interestRate;
	private double durationMonths;
	
	public Loan(double principal, double interestRate, double duration) {
		
		if (principal  <= 0 || interestRate <= 0 || duration <= 0) {
	       System.err.println("error");
	       this.principal = 0;
           this.interestRate = 0;
           this.durationMonths = 0;
		}
		else {
			this.principal = principal;
			this.interestRate = interestRate;
			this.durationMonths = duration;
		}
	}
	
	public double calculateMonthlyPayment() {
		
		if (principal  <= 0 || interestRate <= 0 || durationMonths <= 0) {
			return 0;
		}
		
		double monthlyRate = interestRate / 100 / 12;
		double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -durationMonths));
		return monthlyPayment;
	}
	
	public double getPrincipal() {
		return principal;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getDurationMonths() {
		return durationMonths;
	}

}
