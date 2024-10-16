package com.programs.basic;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		
		for(int number = 5; number > 0; number--) {
			fact *= number;
		}
		
		System.out.println(fact);
	}
	

}
