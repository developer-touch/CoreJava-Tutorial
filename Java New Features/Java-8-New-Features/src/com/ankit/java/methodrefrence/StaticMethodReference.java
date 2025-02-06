package com.ankit.java.methodrefrence;

@FunctionalInterface	
interface MyInterface {
	public abstract void m1();
}

public class StaticMethodReference {
	
	public static void m2() {
		System.out.println("MethodReferenceDemo.m2():: static m2 executed");
	}
	
	public static void main(String[] args) {
		MyInterface my =  StaticMethodReference::m2;
		my.m1();
	}
}
