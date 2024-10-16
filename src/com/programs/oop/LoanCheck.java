package com.programs.oop;

public class LoanCheck {

	public static void main(String[] args) {
		
//		Loan loan = new Loan(10000, 5, 12);
		Loan loan2 = new Loan(20000, 3, 12);
		
		System.out.println("Principle : " + loan2.getPrincipal());
		System.out.println("Intrest Rate : " + loan2.getInterestRate());
		System.out.println("Duration Months : " + loan2.getDurationMonths());
		System.out.printf(	"Monthly Payment : " +	loan2.calculateMonthlyPayment());
		
		
	}
}
