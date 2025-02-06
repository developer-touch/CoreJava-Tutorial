package com.java.MultiThreading;

class MyRunnable01 implements Runnable {

	@Override
	public void run() {
		System.out.println("run executed");
	}
	
}
public class CustomThreadImplemtsRunnable {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyRunnable01 runnable = new MyRunnable01();
		Thread thread = new Thread(runnable);
		thread.start();
		
		System.out.println("main end");
	}
}
