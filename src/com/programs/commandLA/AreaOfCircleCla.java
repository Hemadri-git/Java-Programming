package com.programs.commandLA;

public class AreaOfCircleCla {

	public static void main(String[] args) {

		final double PI = 3.14;
		double r = Integer.parseInt(args[0]);
		double area = PI * r * r;
		System.out.println("Area of Circle : " + area);
	}

}
