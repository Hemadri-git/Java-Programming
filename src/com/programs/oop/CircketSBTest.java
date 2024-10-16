package com.programs.oop;

import java.util.Scanner;

public class CircketSBTest 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter player name: ");
		String playerName = scanner.nextLine();
		
		System.out.print("Enter player runs: ");
		int runs = scanner.nextInt();
		
	    System.out.print("Enter matches played: ");
	    int matches = scanner.nextInt();
	    
	    System.out.println("\n PLAYER DETAILS:  \n");
		
		CircketSB p1 = new CircketSB(playerName, runs, matches);
		p1.getStatistics();
		
		scanner.close();
		
	}

}
