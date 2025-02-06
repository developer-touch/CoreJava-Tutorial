package com.java.Constructor;

public class Constructor_Test01 {
	Constructor_Test01(){
		System.out.println("constructoe executed");
	}
	
	public static void main(String[] args) {
		System.out.println("main executed");
		
		new Constructor_Test01();
	}
}	
