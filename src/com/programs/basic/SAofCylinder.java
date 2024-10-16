package com.programs.basic;

public class SAofCylinder {

	public static void main(String[] args) {
		//	TSA = 2 π r(r+h)
		
		final double PI = 3.14;
		double radius = 3;
		double height = 2;
		double TSA = 2 * PI *  radius * ( radius + height);
		
		System.out.println("Total surface area of a cylinder: " + TSA);
		

	}

}
