package com.programs.basic;

public class MultiplyFloats {

	public static void main(String[] args) {

		
		if(args.length<2) {
			System.out.println("provide two strings as arguments");
			return;
		}
		
		double n1 = Double.parseDouble(args[0]);
		double n2 = Double.parseDouble(args[1]);

		double res = n1 * n2;
		System.out.println("result: " + res);

    }
	

}
