package com.programs.resuable_code_demo;


/*ELC :
-----
It stands for Executable logic class.
We should never write the actual logic in the ELC class.
It is always contain main method from where the execution of the program will start.*/

public class ReuseDemo { 

	public static void main(String[] args) {

		FactorialClass.check(3);
	}
}

/*
 * note: in same package(folder) don't need any import statements to 
 * execute the program, if file present in current folder only.
 * 
 * if the program is present in another package and you wan't to execute the program in  
 * current package we need to import the package with file name.
 * here import is a keyword.
 * 
 * to execute program use className followed by methodName to implement the method present
 *  in the class with the help of (.)operator
 * */
