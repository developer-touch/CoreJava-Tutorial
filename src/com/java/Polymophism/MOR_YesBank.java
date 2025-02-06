package com.java.Polymophism;

public class MOR_YesBank extends MOR_Bank {
	double getROI() {
		System.out.println("Yes ROI");	//not satisfied with the super class given logic
		return 7;						//so overriding as per its requirement,return 7%
	}
}
