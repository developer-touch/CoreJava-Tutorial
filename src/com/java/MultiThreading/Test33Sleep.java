package com.java.MultiThreading;

class MyThread26 extends Thread{
	@Override
	public void run() {
		System.out.println("run executed");
	}
}
public class Test33Sleep {
	 public static void main(String[] args) throws InterruptedException {
		System.out.println("main statr"); 
		
		MyThread26 th = new MyThread26();
		th.start();
		
		Thread.sleep(1000);		//forcing Thread scheduler to pause this thread
								//and allow other waiting threads to execute
		
		System.out.println("main end");
	}
}
