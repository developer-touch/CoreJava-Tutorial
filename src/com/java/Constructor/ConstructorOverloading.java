package com.java.Constructor;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("NPC Executed");
	}
	ConstructorOverloading(int x){
		System.out.println("IPC Executed");
	}
	ConstructorOverloading(String s){
		System.out.println("SPC Executed");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Executed");
		ConstructorOverloading co1 = new ConstructorOverloading();
		ConstructorOverloading co2 = new ConstructorOverloading(10);
		ConstructorOverloading co3 = new ConstructorOverloading("A");
	}
}
