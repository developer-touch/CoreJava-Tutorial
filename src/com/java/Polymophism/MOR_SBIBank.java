package com.java.Polymophism;

public class MOR_SBIBank extends MOR_Bank {
	double getROI() {
		System.out.println("SBI ROI");	//not satisfied with the super class given logic 
		return 6; 						//so overriding as per its requirement,return 6 %
	}
}	
