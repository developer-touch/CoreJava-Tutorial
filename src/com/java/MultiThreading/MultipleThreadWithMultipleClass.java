package com.java.MultiThreading;

class MyThread10 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("first class run i :: "+i);
		}
	}
}
class MyThread11 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			System.out.println("second class run i :: "+i);
		}
	}
}
public class MultipleThreadWithMultipleClass {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread10 th1 = new MyThread10();
		th1.start();
		
		MyThread11 th2 = new MyThread11();
		th2.start();
		
		System.out.println("main end");
	}
}
