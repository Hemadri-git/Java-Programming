package com.programs.resuable_code_demo;

public class Circle {
	
	 public static String getArea(double radius)
	  {		 
		 if(radius <= 0) {
			 return ""+ 0;
		 }
		 else {
			final double PI = 3.14;
			double areaOfCircle = PI * radius * radius;
			
			return ""+areaOfCircle;
		}
	  }
	
	

}
