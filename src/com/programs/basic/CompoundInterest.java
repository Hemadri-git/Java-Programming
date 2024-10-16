package com.programs.basic;

public class CompoundInterest {

	public static void main(String[] args) {

		double principle = 100000;
		double rate = 3;
		
		double amount = principle * ((1+rate/100)*(1+rate/100)*(1+rate/100));
		
		System.out.println("Compound Instrest : " + amount);
		
		
	}

}
