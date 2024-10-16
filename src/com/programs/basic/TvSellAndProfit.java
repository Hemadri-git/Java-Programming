package com.programs.basic;

public class TvSellAndProfit {
	public static void main(String[] args) {
		double cost = 32500;
		double profit = cost * 0.27;
		double vat = 12.7 / 100;
		double service = 3.87 / 100;
		double sellingPrice = cost + profit;
		double vatTax = sellingPrice * vat;
		double serviceCharge = sellingPrice * service;
		double totalSellingPrice = sellingPrice + vatTax + serviceCharge;
		System.out.println("total Selling Price: " + totalSellingPrice);
		System.out.println("Profit : " + profit);
		System.out.println("Vat : " + vatTax);
		System.out.println("service charge: " + serviceCharge);

	}

}
