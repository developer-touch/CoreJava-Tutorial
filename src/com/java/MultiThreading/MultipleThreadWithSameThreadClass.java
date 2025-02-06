package com.java.MultiThreading;

class MyThread09 extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println("run i :: "+i);
		}
	}
}
public class MultipleThreadWithSameThreadClass {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread09 th1 = new MyThread09();
		th1.start();
		
		MyThread09 th2 = new MyThread09();
		th2.start();
		
		MyThread09 th3 = new MyThread09();
		th3.start();
		
		System.out.println("main end");
		
	}
}
