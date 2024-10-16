package com.programs.oop;

public class ElectricVehcileTest {

	public static void main(String[] args) {
		
		ElectricVehcile  s1 = new ElectricVehcile();
		s1.setElectricVehicleDetails("ford", "ap112", 324, 342);
		String electricVehicleDetails = s1.getElectricVehicleDetails();
		System.out.println(electricVehicleDetails);
	}
}
