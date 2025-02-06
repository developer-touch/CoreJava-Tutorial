package com.java.MultiThreading;

public class Test30ToStringMethod {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		//System.out.println(th1.toString());
		System.out.println(th1); //Thread[name,priority,groupname]
		
		Thread th2 = new Thread("Child-1");
		System.out.println(th2);
		
		Thread th3 = Thread.currentThread();
		System.out.println(th3);
		th3.setPriority(7);
		System.out.println(th3);
		
		Thread th4 = new Thread();
		System.out.println(th4.toString());
	}
}
