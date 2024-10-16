package com.programs.resuable_code_demo;

public class TwoDigitsSum {

	public static int getTwoDigitsSum(int num) {
		//only two digits use this approach
//            int num1 = num%10;
//            int num2 = num/10;
//            int sum = num1 + num2;
//            return sum;
		
		//for any multiple numbers use this approach
		
		int digit = 0;
		while(num>0) {			
			digit = digit + num % 10;
			num/=10;
		}
		return digit;

	}
}
