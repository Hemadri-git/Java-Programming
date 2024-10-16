package com.programs.resuable_code_demo;

public class NextMultipleOfHundred {

	public static int getNextMultipleOfHundred(int num) {
		
		int rem = num%100;
		
		if(rem == 0) {
			return rem;
		}
		else {
			return (num + (100 - rem));
		}
	}
}
