package com.programs.resuable_code_demo;

public class PalindromeClass {

	public static void check(int n) {
		
		int number = n;
		int originalNumber = number;
		int reversedNumber = 0;
		
		while(number!=0) {
			int digit = number%10;
			reversedNumber = reversedNumber * 10 + digit;
			number = number/10;
		}
		
		if(originalNumber == reversedNumber) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not an Palindrome Number");
		}
	}
}
