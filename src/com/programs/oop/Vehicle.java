package com.programs.oop;

public class Vehicle {
	
	String vehicleModel;
	String licensePlate;
	String color;
	double engineCapacity;
	
   public void setVehicleDetails(String vehicleModel, String licensePlate, String color, double engineCapacity) {
	   this.vehicleModel = vehicleModel;
	   this.licensePlate = licensePlate;
	   this.color = color;
	   this.engineCapacity = engineCapacity;
   }

   public String getVehicleDetails() {
	   return "" + "[vehicle Model : "+ vehicleModel + " license Plate : " + licensePlate + " color : " + color + " engine capacity: " + engineCapacity + "]";
	   
	}
}
