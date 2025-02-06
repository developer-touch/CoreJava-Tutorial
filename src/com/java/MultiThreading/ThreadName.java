package com.java.MultiThreading;

public class ThreadName {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		System.out.println(th1.getName());
		
		Thread th2 = new Thread();
		System.out.println(th2.getName());
		
		Thread th3 = new Thread("Ankit");
		System.out.println(th3.getName());
		
		Thread th4 = new Thread();
		System.out.println(th4.getName());
		th4.setName("Monu");
		System.out.println(th4.getName());
		System.out.println();
	}
}

