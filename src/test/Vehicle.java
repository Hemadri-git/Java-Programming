package test;



public class Vehicle {
	
	private String vehicleName;
	private int maxSpeed;
	private String fuelType;
	
	public Vehicle() {
		vehicleName = null;
		maxSpeed = 0;
		fuelType =  null;
	}
	
	
	public Vehicle(String vehicleName, int maxSpeed) {
		super();
		this.vehicleName = vehicleName;
		this.maxSpeed = maxSpeed;
		
		if (vehicleName == null) {
			System.err.println("must have name");
		}
		else if (maxSpeed <= 0) {
			System.err.println("cant Be zero must be positive");
		}
	}


	public Vehicle(String vehicleName, int maxSpeed, String fuelType) {
		super();
		this.vehicleName = vehicleName;
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
		
		if (vehicleName == null) {
			System.err.println("must have name");
		}
		else if (maxSpeed <= 0) {
			System.err.println("cant Be zero must be positive");
		}
		else if (fuelType == null) {
			System.err.println("cant be empty");
		}
	}



	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", maxSpeed=" + maxSpeed + ", fuelType=" + fuelType + "]";
	}
	
	
}
