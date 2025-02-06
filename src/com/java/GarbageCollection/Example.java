package com.java.GarbageCollection;

public class Example {
	int x ;
	Example(){
		x = 10;
		System.out.println("In Constructor"+this);
	}
	public void finalize() {
		System.out.println("In Finalize"+this);
	}
}
