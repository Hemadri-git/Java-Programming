package com.programs.basic;

import java.util.Scanner;

public class CSAOfCube {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter area: ");
         int area = sc.nextInt();
         int CSA  = 4 * (area * area);
         System.out.println("CSA of Cube is : " + CSA);
         sc.close();
		
	}

}
