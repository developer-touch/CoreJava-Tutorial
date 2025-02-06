package com.java.MH_OVR;

public class Test_AB {
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		System.out.println();
		
		A a1 = new B();
		a1.m1();
		a1.m2();
		a1.m3();
		//a1.m4();
		
		
		/**
		 * By using super class type reference variable
		 * we can't access sub class specific members its
		 * leads CE
		 * 
		 * By using super class type reference variable 
		 * we can access only the member available in
		 * super class.
		 */
	}
}
