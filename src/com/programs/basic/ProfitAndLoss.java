/*Write a java program to find the profit and loss by following the formula 
Profit and loss Formulas – 
Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100*/


package com.programs.basic;

import java.util.Scanner;

public class ProfitAndLoss {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	      System.out.println("enter cost price: ");
	      double costPrice = sc.nextDouble();
	      
	      System.out.println("enter selling price: ");
	      double sellingPrice = sc.nextDouble();
	      
	      if(sellingPrice > costPrice) {
	    	  double profit = sellingPrice - costPrice;
	    	  double profitPercentage = (profit/ costPrice) * 100;
	    	  System.out.println("profit: " + profit);
	    	  System.out.println("profit Percentage: " + profitPercentage);
	      }
	      else if(costPrice > sellingPrice) {
	    	  double loss = costPrice - sellingPrice;
	    	  double lossPercentage = (loss / costPrice) * 100;
	    	  System.out.println("loss: " + loss);
	    	  System.out.println("loss Percentage : " + lossPercentage);
	      }
	      else {
	    	  System.out.println("NO! Profit, Loss");
	      }
	      

	        sc.close();


		
	}

}
