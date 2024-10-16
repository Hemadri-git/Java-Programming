package com.programs.basic;

import java.util.Scanner;

public class WholeSaleDiscount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your net bill : ");
		double netBill = sc.nextInt();
		
		double discountPercent;
		
		if(netBill < 5000) {
			discountPercent = 5;
		}
		else if(netBill >= 5000 && netBill < 10000) {
			discountPercent = 10;
			
		}
		else {
			discountPercent = 15;
		}
		
		double discountAmount = (netBill * discountPercent)/100;
		double payableAmount = netBill - discountAmount;
		
		System.out.println("The Discount Percentage is: " + discountPercent);
		System.out.println("The Discount Amount is: " + discountAmount);
		System.out.println("The Payable Amount is: " + payableAmount);
		sc.close();	
		
	}
		

}
