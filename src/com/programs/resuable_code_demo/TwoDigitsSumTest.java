/*Program-1
Define a method which returns the sum of digits of the given two digit number.
Write the method with the following specifications: 
Name of the BLC class:TwoDigitsSum
Name of method: getSumOfDigits()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 34, return 7*/

package com.programs.resuable_code_demo;

import java.util.Scanner;

public class TwoDigitsSumTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits to get sum: ");
		int num  = sc.nextInt();
		
		int twoDigitsSum = TwoDigitsSum.getTwoDigitsSum(num);
		System.out.print("Sum of digits is : " + twoDigitsSum);
		sc.close();
		
	}

}
