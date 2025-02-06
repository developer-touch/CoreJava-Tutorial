package com.java.MultiThreading;

public class CurrentThreadNamePriority {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		
		System.out.println(th1.getId());
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
		
		th1.setName("ABC");
		th1.setPriority(8);
		System.out.println();
		
		System.out.println(th1.getId());
		System.out.println(th1.getName());
		System.out.println(th1.getPriority());
	}
}
