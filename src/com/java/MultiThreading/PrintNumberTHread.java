package com.java.MultiThreading;

class MyThread02 extends Thread{
	@Override
	public void run() {
		for(int i = 20; i>0; i--) {
			System.out.println("run i :: "+i);
		}
	}
}
public class PrintNumberTHread {
	public static void main(String[] args) {
		
		MyThread02 pn = new MyThread02();
		pn.start();
		
		for(int i = 0; i<=20; i++) {
			System.out.println("main i :: "+i);
		}
	}
}
