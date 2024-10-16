package com.programs.oop;

import java.util.Scanner;

public class VehicleTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        
		System.out.println("Enter Vehicle model: ");
		String vehicleModel = scanner.nextLine();
		
		System.out.println("Enter license Plate : ");
		String licensePlate = scanner.nextLine();
		
		System.out.println("Enter color : ");
		String color = scanner.nextLine();
		
		System.out.println("Enter engine Capacity : ");
		double engineCapacity = scanner.nextDouble();		
	   
		
		Vehicle car  = new Vehicle();
		car.setVehicleDetails(vehicleModel, licensePlate, color, engineCapacity);
		String vehicleDetails = car.getVehicleDetails();
		System.out.println(vehicleDetails);
		
		scanner.close();
	}

}
