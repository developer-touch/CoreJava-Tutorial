/**
 * Method Overriding ->
 * --------------------
 * =>Creating a method in super class and in sub class with the same signature is called method overriding.
 * 
 * =>We need overriding for developing new implementation to the super class method in sub classs requirement.
 * 
 * =>For example :: to provide rate of interest (ROI) by different banks as per their requirement we must override 
 *      			getROI() method as shown in below example
 */
package com.java.MethodOverRidding;

public class MOVR_Demo {
	class Bank {
		double getROI() {
			System.out.println("Bank ROI");
			return 4;		//default implementation
		}					//common to all sub types
	}

	class HDFCBank extends Bank {
						//need same implementation given in super class
	}					//so not overriding, reusing the existing logic

	class KotakBank extends Bank {
		double getROI() {	//not satisfied with the logic give in super class
							//overriding as per its requirement, returning 6%	
			System.out.println("KotakBank ROI");
			return 6;		
		}
	}

}

