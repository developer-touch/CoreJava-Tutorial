package com.java.NSMsExecutionFlow;

public class Test_NSB_01 {
	int x = 10;
	
	{
		System.out.println("\nNSB start");
		int x = 20;
		x = 30;
		System.out.println("\nNSB x :: "+x);
		
		System.out.println("\nNSB x :: "+this.x);
		
		System.out.println("\nNSB end");
	}
	
	public static void main(String[] args) {
		System.out.println("\nmain start");
		
		Test_NSB_01 tn = new Test_NSB_01();
		System.out.println("\nx ::"+tn.x);
		
		System.out.println("\nmain end");
	}
}
