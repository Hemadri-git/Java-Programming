package com.programs.commandLA;

public class CubeCla {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(args[0]);
		int cube = number * number * number;
		System.out.println("Cube of " + number + " is: " + cube);
	}

}
