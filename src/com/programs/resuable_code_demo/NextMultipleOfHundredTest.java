/*Program-3
Define a method which returns the next multiple of 100 for the given number.
Write the method with the following specifications: 
Name of the BLC class:NextMultipleOfHundred
Name of method: getNextMultipleOfHundred()
Access Modifier : public, static
Arguments: one argument of type integer
Return type: an integer value
For example,
If the given value is 123, return 200.

Create an ELC class Main to test the application*/

package com.programs.resuable_code_demo;

public class NextMultipleOfHundredTest {

	public static void main(String[] args) {

		int nextMultipleOfHundred = NextMultipleOfHundred.getNextMultipleOfHundred(223);
		System.out.println("Next Multiple Of Hundred is: " + nextMultipleOfHundred);
	}

}
