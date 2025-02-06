package com.java.MultiThreading;

class MyThread24 extends Thread{
	@Override
	public void run() {
		System.out.println("run start");
		
		for(int i = 1; i<=20; i++) {
			System.out.println("run i :: "+i);
		}
		System.out.println("run end");
	}
}
public class Test31Daemon {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		System.out.println(th1.isDaemon());
		
		Thread th2 = new Thread();
		System.out.println(th2.isDaemon());
		
		Thread th3 = new Thread();
		System.out.println(th3.isDaemon());
		
		Thread th4 = new Thread();
		th4.setDaemon(true);
		th4.start();
	}
}
