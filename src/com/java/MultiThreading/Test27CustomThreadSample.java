package com.java.MultiThreading;

class Sample{
	static void m1() {
		Thread th = Thread.currentThread();
		System.out.println("m1 is executing in "+th.getName()+" thread");
	}
}


public class Test27CustomThreadSample {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Sample.m1();
		
		MyThread22 th1 = new MyThread22(); 
		th1.run();
		
		Runnable18 mr = new Runnable18();
		mr.run();
		
		th1.start();
		
		new Thread(mr).start();
	}
}

class MyThread22 extends Thread{
	@Override
	public void run() {
		Sample.m1();
	}
}

class Runnable18 implements Runnable{
	@Override
	public void run() {
		Sample.m1();
	}
}