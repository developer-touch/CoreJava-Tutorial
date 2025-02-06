package com.java.MultiThreading;

public class ExampleTest {
	public static void main(String[] args) {
		System.out.println("main start");
		Test01Example.m1();
		Test01Example.m2();
		Test01Example.m3();
		System.out.println("main end");
	}
}
