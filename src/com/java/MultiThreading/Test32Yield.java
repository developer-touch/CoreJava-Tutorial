package com.java.MultiThreading;

class MyThread25 extends Thread{
	@Override
	public void run() {
		System.out.println("run executed");
	}
}
public class Test32Yield {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread25 th = new MyThread25();
		th.start();
		
		Thread.yield();	//giving information to THread scheduler give 
						//this Thread resource to other waiting thread
						//It may or may not accept
						//this thread may or may not paused
		System.out.println("main end");
		
	}
}
 