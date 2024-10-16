package com.programs.resuable_code_demo;

public class TwoDigitsDifference {
	
	public static int getDiffOfDigits(int num) {

		int num1 = num%10;
		int num2 = num/10;
		int diff = num2 - num1;
		return diff;
		
		
	}

}
