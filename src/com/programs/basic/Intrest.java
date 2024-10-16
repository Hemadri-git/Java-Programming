package com.programs.basic;

import java.util.Scanner;

public class Intrest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double principal = in.nextDouble();
		double rate = in.nextDouble();
		double time = in.nextDouble();
		
		double simpleIntrest = (principal * rate * time)/100;
		System.out.println("Simple Intrest:  "+ simpleIntrest);
		double total = simpleIntrest + principal;
		System.out.println("Total Intrest : "+ total);
		in.close();
		
	}
}
