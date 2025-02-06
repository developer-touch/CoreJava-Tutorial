package com.java.IOStream;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("run Method");
		for(int i=1; i<=20; i++) {
			System.out.println("run i ::"+i);
			
		}
	}
}
public class PrintNumber {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i=20; i>0; i--) {
			System.out.println("main i ::"+i);
		}
	}
}
