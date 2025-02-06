package com.java.MultiThreading;

class MyThread28 extends Thread{
	@Override
	public void run() {
		System.out.println("run start");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run end");
	}
}
public class Test36Join {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		MyThread28 th = new MyThread28();
		th.start();
		 
		//th.join();
		th.join(100);
		System.out.println("main end");
	}
}
