package com.ankit.java.dm.demo;

public class U implements P{
	@Override
	public void m1() {
		System.out.println("U::m1()");
		System.out.println("Interface abstract-m1() method from class-U");
	}
	
	@Override
	public void m2() {
		P.super.m2();
		System.out.println("Interface m2-method() from Interface U");
		P.super.m2();
	}
}
