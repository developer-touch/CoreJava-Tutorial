package com.ankit.java.dm.demo;

public interface P {
	abstract void m1();

	default void m2() {
		System.out.println("Interface default-method() from Interface P");
	}
}
