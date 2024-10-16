package com.programs.commandLA;

public class TwoDigitSumCla {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		int twoDigit = 0;
		
		while(number!=0) {
			twoDigit = twoDigit + number % 10;
			number = number / 10;
		}

		System.out.println("sum of two digit : " + twoDigit);
	}

}
