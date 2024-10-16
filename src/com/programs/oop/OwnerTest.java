package com.programs.oop;

import java.util.Scanner;

public class OwnerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Owner owner = new Owner();
		
		System.out.println("Owner name: ");
		String ownerName = scanner.nextLine();
		
		System.out.println("Owner id: ");
		int ownerId = scanner.nextInt();
		
		System.out.println("address : ");
		scanner.nextLine();
		String address = scanner.nextLine();
		
		owner.setOwnerDetails(ownerName, ownerId, address);
		String ownerDetails = owner.getOwnerDetails();
		System.out.println(ownerDetails);
		
		scanner.close();
	}
}
