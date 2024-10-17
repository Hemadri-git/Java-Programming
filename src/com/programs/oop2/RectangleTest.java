package com.programs.oop2;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 10);
		
		double area = rectangle.getArea();
		double parameter = rectangle.getParameter();
		
		System.out.println("Area: " + area);
		System.out.println("Parameter: " + parameter);
	}
}
