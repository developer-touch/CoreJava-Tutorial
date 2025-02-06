package com.java.MethodHiding;

public class AB_Test {
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		
		A a = new B();
		a.m1();
		a.m2();
		//a.m3();
	}
}
