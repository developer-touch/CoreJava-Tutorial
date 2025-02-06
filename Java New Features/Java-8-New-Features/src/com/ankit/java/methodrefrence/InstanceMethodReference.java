package com.ankit.java.methodrefrence;

public class InstanceMethodReference {
	public void m1() {
		System.out.println("NonStaticMethodReference.m2()::non-static m2 executed");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		Runnable runnable = instanceMethodReference::m1;
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
