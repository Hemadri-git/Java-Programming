package com.programs.oop2;

import java.util.Scanner;

public class InventoryItemTest 
{
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
//		InventoryItem inventoryItem = new InventoryItem("apple", 10, 15);
//		 System.out.println(inventoryItem.calculateTotalValue());
		
		System.out.print("Enter Item Name: ");
		String itemName = sc.nextLine();
		
		System.out.print("Enter Price Unit: ");
		double priceUnit = sc.nextDouble();
		
		System.out.print("Enter Quantity In Stock: ");
		int quantityInStock = sc.nextInt();
		
		
		InventoryItem inventoryItem2 = new InventoryItem(itemName, priceUnit, quantityInStock);
		System.out.println("Total Value of Apples in Stock: ");
		System.out.println(inventoryItem2.calculateTotalValue());
	}
}
