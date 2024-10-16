package com.programs.oop;

public class Fan {
	
    String name = "Orient";
	String coil = "Aliminium";
	int wings = 3;
	
	public void getFanDetails() {
		System.out.println(name);
		System.out.println(coil);
		System.out.println(wings);
		System.out.println("--------------------------");
	}
	
	public void switchOn() {
		System.out.println("The Fan Switch is On!!");
	}
	
	public void switchOff() {
		System.out.println("The fan Switch is off!!");
	}
	
	

}
