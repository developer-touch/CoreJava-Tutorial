package com.java.MultiThreading;

class MyRunnable02 implements Runnable {
	@Override
	public void run() {
		for(int i = 20; i>=1; i--) {
			System.out.println("run i :: "+i);
		}
	}
}
public class PrintNumberImplements {
	public static void main(String[] args) {
		
		
		MyRunnable02 mr = new MyRunnable02();
		Thread th = new Thread(mr);
		th.start();
		
		for(int i = 1; i<=20; i++) {
			System.out.println("main i :: "+i);
		}
	}
}
