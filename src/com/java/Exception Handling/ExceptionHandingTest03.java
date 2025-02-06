/**
	Multiple catch block ->
	1.catch blocks should not be duplicated
	2.Super class parameter catch block should not be placed before child class
	  parameter catch block.

	  CE : exception has already been caught
*/
package com.java.ExceptionHandling;

class RuleOfTryCatch{
	public static void main(String[] args){
		try{
			System.out.println("in main try");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			System.out.println("Divide ::"+(a/b));
			System.out.println("Add ::" +(a+b));
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Please pass atleat one numer");
			System.out.println("Else Result ::"+(5+5));
		}
		catch(NumberFormatException nfe){
			System.out.println("Please pass only integer numer");
			System.out.println("Else Result ::"+(10+5));
		}
		catch(ArithmeticException ae){
			System.out.println("Please don't pass second numer Zero");
			System.out.println("Else Result ::"+(20+5));
		}

		//catch(NullPointerException npe){System.out.println(" in main catch-02");} exception already been caught

	}
}