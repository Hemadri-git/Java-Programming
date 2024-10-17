package com.programs.oop2;

public class Rectangle 
{
	private double width;
	private double height;
	
	{
		width = 0;
		height = 0;
	}

	public Rectangle(double width, double height) {
		super();
		
		if (width < 0) {
			System.err.println("Invalid Case: Negative width");
		}
		else {
			this.width = width;
		}
		
		if (height < 0) {
			System.err.println("Invalid Case: Negative height");
		}
		else {
			this.height = height;
		}
	}

	public double getArea() {
		return (width * height);
	}
	
	public double getParameter() {
		return 2 * (width + height);
	}
}
