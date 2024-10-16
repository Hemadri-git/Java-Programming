package com.programs.resuable_code_demo;

public class FactorialClass { 
	
	/*BLC :
	-----
	It stands for Business Logic class. 
	We should always write the logic in BLC class.
	BLC class will never contain main method, It will only contain the logic.
	Example below*/
	
	public static void check(int n) {
		int number = n;
		int fact = 1;
		for(number = n; number>0 ; number-- ) {
			fact = fact * number;
		}
		System.out.println("Factorial of given number is : " + fact);
	}

}
