package com.programs.resuable_code_demo;

import java.util.Scanner;

public class CalculateSpyTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check Spy number: ");
		int num = scanner.nextInt();
		
		CalculateSpy.checkSpyNum(num);
		scanner.close();
	}

}
