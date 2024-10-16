package com.programs.oop2;

public class InventoryItem {

	private String itemName;
	private double pricePerUnit;
	private int quantityInStock;
	
	public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
		super();
		
		if (itemName == null || itemName == "") {
			System.err.println("Error message indicating invalid item name.");
			return;
		}
		this.itemName = itemName;
		
		if (pricePerUnit < 0) {
			System.err.println("Error message indicating invalid item price.");
			return;
		}
		this.pricePerUnit = pricePerUnit;
		
		if (quantityInStock < 0) {
			System.err.println("Error message indicating invalid quantity.");
			return;
		}
		this.quantityInStock = quantityInStock;
	} 

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	public double calculateTotalValue() {
		
		return (pricePerUnit * quantityInStock);
	}
	
}
