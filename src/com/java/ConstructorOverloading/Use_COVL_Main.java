package com.java.ConstructorOverloading;

public class Use_COVL_Main {
	public static void main(String[] args) {
		
		Use_COVL e = new Use_COVL();
		System.out.println(e);
		
		Use_COVL e2 = new Use_COVL(50);
		System.out.println(e2);
		
		Use_COVL e3 =  new Use_COVL("70");
		System.out.println(e3);
	}
}
