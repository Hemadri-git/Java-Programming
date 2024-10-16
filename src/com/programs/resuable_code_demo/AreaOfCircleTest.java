package com.programs.resuable_code_demo;

import java.text.*;
import java.util.Scanner;

public class AreaOfCircleTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius to get Area of Circle: ");
        double radius = sc.nextDouble();
        
        String area = Circle.getArea(radius);
        double getArea = Double.parseDouble(area);
        
        DecimalFormat  df = new DecimalFormat(".00");
        System.out.println("Area of circle is : "+ df.format(getArea));
        
        sc.close();
 	}

}
