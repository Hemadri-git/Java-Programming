package com.programs.commandLA;

public class AreaOfRectangleCla {

	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		int breath = Integer.parseInt(args[1]);
		int AOR = length * breath;
		System.out.println("Area Of Rectangle : " + AOR );
	}

}
