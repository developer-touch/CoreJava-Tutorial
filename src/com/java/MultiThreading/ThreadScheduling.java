package com.java.MultiThreading;

class MyThread19 extends Thread{
	@Override
	public void run() {
		//task#2
		for(int i = 20; i>=1; i--) {
			System.out.println("run i : "+i);
		}
	}
}
public class ThreadScheduling {
	public static void main(String[] args) {
		MyThread19 th = new MyThread19();
		th.start();
		
		//task#1
		for(int i = 1; i<=20; i++) {
			System.out.println("main i : "+i);
		}
	}
}
