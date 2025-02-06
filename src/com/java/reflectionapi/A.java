package com.java.reflectionapi;

public class A {
	static int a = m1();
	static int m1() {
		System.out.println("A : m1 static method");
		return 10;
	}
	
	int x = m2();
	int m2() {
		System.out.println("A : m2 non-static method");
		return 20;
	}
	
	static {
		System.out.println("A : static block");
	}
	
	{
		System.out.println("A : non-static block");
	}
	
	A(){
		System.out.println("A : NP constructor");
	}
	
	A(int x){
		System.out.println("A : IP constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("A : main");
	}
	
	static void m3() {
		System.out.println("A : void m3 method");
	}
	
	static String m3(int i ) {
		System.out.println("A : String method "+i);
		return "abc";
	}
}
