package com.programs.oop;

public class ElectricVehcile {
	
	String vehicleModel;
	String licensePlate;
	double batteryCapacity;
	double rentalPricePerHour;
	
     public void setElectricVehicleDetails(String vehicleModel, String licensePlate, double batteryCapacity, double rentalPricePerHour) {
    	 this.vehicleModel = vehicleModel;
    	 this.licensePlate = licensePlate;
    	 this.batteryCapacity = batteryCapacity;
    	 this.rentalPricePerHour = rentalPricePerHour;
    	 
     }
     
     public String getElectricVehicleDetails() {
    	 return "vehicleModel: " + vehicleModel + " licensePlate: " + licensePlate + " batteryCapacity: " +  batteryCapacity + " rentalPricePerHour: " + rentalPricePerHour;
     }

}
