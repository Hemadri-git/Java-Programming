package com.programs.resuable_code_demo;

import java.util.Scanner;

public class EvenOrOddTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number to check even or odd : ");
		int num = scanner.nextInt();
		
		boolean even = EvenOrOdd.isEven(num);
		System.out.println(num + " is Even ? " + even);
		
		scanner.close();
	}

}
