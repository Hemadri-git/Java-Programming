package com.programs.basic;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		System.out.println("Enter Fahrenheit to Convert: ");
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit = sc.nextDouble();
		double celsius =( (fahrenheit-32)*5)/9;
		System.out.println("fahrenheit to celsius : " + celsius);
		sc.close();
	}

}
