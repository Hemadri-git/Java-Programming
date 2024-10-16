package com.programs.oop;

public class Dog {
	
	String name;
	double height;
	int age;
	
	public void getDogInformation() {
		name = "snoppy";
		height = 4.5;
		age = 5;
		
		System.out.println("Name :" + name);
		System.out.println("height :" + height);
		System.out.println("age :" + age);

	}
	
	public void bark() {
		System.out.println("BARK!! BARK!!!");
	}

}
