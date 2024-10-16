package com.programs.basic;

public class Palindrome {

	public static void main(String[] args) {

		int number = 131;
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
