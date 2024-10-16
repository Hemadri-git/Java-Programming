package com.programs.basic;

import java.util.Scanner;

public class DaysMonthsYears {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	     System.out.print("Enter Number of Days: " );
	    int totalDays = in.nextInt();
	  
	    int years = totalDays/365;
	    int RemDaysAfterYear = totalDays%365;
	
	    int months = RemDaysAfterYear/30;
	    int days = RemDaysAfterYear%30;
	    
	    System.out.println("years: " + years);
	    System.out.println("months: " + months);
	    System.out.println("days: " + days);
	    in.close();
	    
	    
	    
	     
	}

}
