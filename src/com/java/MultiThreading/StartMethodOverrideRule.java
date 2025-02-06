package com.java.MultiThreading;

class MyThread15 extends Thread{
	@Override
	public void run() {
		System.out.println("run executed");
	}
	@Override
	public void start() {
		System.out.println("start executed");
		super.start();
	}
}
public class StartMethodOverrideRule {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread15 th1 = new MyThread15();
		th1.start();
		
	}
}
