package com.java.MultiThreading;

class MyThread16 extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread16 run ");
		
		MyThread17 th1 = new MyThread17();
		th1.start();
	}
}

class MyThread17 extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread17 run");
	}
}
public class CustomThreadFromCustomThread {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread16 th2 = new MyThread16();
		th2.start();
		
		System.out.println("main end");
	}
}
