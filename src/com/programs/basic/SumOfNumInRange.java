//WAP in java to print the sum of first hundred natural number


package com.programs.basic;

public class SumOfNumInRange {
	
	public static void main(String[] args) {
		
		int number = 100;
		int sum = 0;
		for(int i = 0; i<=number; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of the first 100 natural numbers is: " + sum);
		
		
	}

}
