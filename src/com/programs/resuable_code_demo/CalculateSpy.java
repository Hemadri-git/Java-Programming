package com.programs.resuable_code_demo;

public class CalculateSpy {
	
	public static void checkSpyNum(int num) {
		
		int sum = 0, product = 1, digit;
		int temp = num;
		
		while(temp!=0) {
			digit = temp%10;
			sum += digit;
			product *= digit;
			temp /= 10;
			
		}
		
		if(sum == product) {
			System.out.println(num + " is a Spy Number.");
		}
		else {
			System.out.println(num + " is Not a spy number");
		}
		
		
	}

}
