package com.programs.oop;

import java.util.Scanner;

public class Product {

	int productId;
	String productName;
	double ProductPrice;
	
	public void setProductData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Product ID: ");
		productId = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("Enter Product Name: ");
		productName = scanner.nextLine();
		
		System.out.print("Enter product price: ");
		ProductPrice = scanner.nextDouble();
		
		scanner.close();
	}
	
	public void getProductInfo() {
		
		System.out.println("\nProduct Details: ");
		System.out.println("Product id is: "+ productId);
		System.out.println("Product name is: "+ productName);
		System.out.println("Product price is: "+ ProductPrice);

	}
}
