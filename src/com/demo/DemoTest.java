package com.demo;

import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		Demo[] d1 = new Demo[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter Details for Employees "+ (i + 1)+ ": ");
			System.out.println("--------------------------- ");
			d1[i] = Demo.getEmployeeObject();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(d1[i].toString());
		}
	}

}