/**
 * A method is executed when we call it.When we override method when we call it.
 * It is executed from the sub class or super class.It is depends on the object we have 
 * used to call this method.
 * 
 * If we call overridden method by using 
 */
package com.java.Polymophism;

public class MOR_Test {
	public static void main(String[] args) {
		/**
		 * 1.Reference variable and object are of super class type Bank
		 */
		MOR_Bank bank = new MOR_Bank();
		bank.getROI();		//Searching for method in super class and execute from super class.
		
		/**
		 * 2.Reference variable and object of sub class HDFC
		 */
		MOR_HDFCBank hdb = new MOR_HDFCBank();
		hdb.getROI();	   //Searching for method in sub class and execute from super class
		
		/**
		 * 3.Reference variable and object of sub class SBI
		 */
		MOR_SBIBank sb = new MOR_SBIBank();
		sb.getROI();	   //Searching for method in sub class and execute from sub class
	}
}
