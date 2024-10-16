//WAP in java to print all even numbers from 1 - 100


package com.programs.basic;

public class EvenNumInRange {

	public static void main(String[] args) {
		
		System.out.println("Even Number in between 1 - 100: ");
		for(int i = 2; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
