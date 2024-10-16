package com.programs.basic;

public class BillingAtShop {
   public static void main(String[] args) {

		int chickenRolles = 60;
		int vegPuffs = 25;
		int discount = 50;
		
		int total = (4 * chickenRolles) + ( 3 * vegPuffs ) - (discount);
		
		System.out.println("Total bill is : " + total);
    }
   
}
