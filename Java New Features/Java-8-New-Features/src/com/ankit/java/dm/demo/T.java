package com.ankit.java.dm.demo;

public class T implements P {
	@Override
	public void m1() {
		System.out.println("T::m1()");
		System.out.println("Interface abstract-m1() method from class-S");
	}
	
	public void m2() {
		System.out.println("Interface default-method() from Interface T");
	}
}
