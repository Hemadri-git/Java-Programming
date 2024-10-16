package com.programs.commandLA;

public class AreaLengthCalculateCla {

	public static void main(String[] args) {
		int length = args.length;

		if(length == 0){
		System.out.println("Array length is Zero");
		}
		else if(length == 1){
			int n = Integer.parseInt(args[0]);
			int cube = n * n * n;
			System.out.println("area of cube: " + cube);
		}
		else if(length == 2){
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int sum = a + b;
			System.out.println("addition of two numbers " + sum);

		}
		else{
			System.out.println("invalid");
		}
	}

}
