package com.programs.commandLA;

public class SumAndAvgOfNumbersCla {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);

		int sum = n1 + n2 + n3;

		int avg = (n1 + n2 + n3) / 3;

		System.out.println("Sum is :" + sum);
		System.out.println("Average is :" + avg);
	}

}
