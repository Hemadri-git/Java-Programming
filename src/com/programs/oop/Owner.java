package com.programs.oop;

public class Owner {

	String ownerName;
	int ownerId;
	String address;
	
	public void setOwnerDetails(String ownerName, int ownerId, String address) {
		this.ownerName = ownerName;
		this.ownerId = ownerId;
		this.address = address;

	}
	
	public String getOwnerDetails() {
		return "" + "[ owner name: " + ownerName + " owner ID : " + ownerId + " address: " + address + "]";
	}
}
