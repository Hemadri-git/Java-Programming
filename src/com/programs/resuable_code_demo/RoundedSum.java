package com.programs.resuable_code_demo;

public class RoundedSum {

	public static int sumOfRoundedValues(int num1, int num2, int num3) {
		int roundNum1 = ((num1+5)/10) * 10;
		int roundNum2 = ((num2+5)/10) * 10;
		int roundNum3 = ((num3+5)/10) * 10;

		return (roundNum1 + roundNum2 + roundNum3);
		
	}
}
