package com.programs.commandLA;

public class AdditionCla {

	public static void main(String[] args) {
		
		String x = args[0];
		String y = args[1];
		
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int sum = a + b;
		System.out.println("Sum is: "+ sum);

	}

}
