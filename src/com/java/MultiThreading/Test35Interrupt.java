package com.java.MultiThreading;

class MyThread27 extends Thread{
	@Override
	public void run() {
		System.out.println("run start");
		System.out.println("Thread is paused");
		
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Threas is resumed");
		System.out.println("run end");
	}
}
public class Test35Interrupt {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread27 th = new MyThread27();
		th.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Interrupted is called");
		th.interrupt();	//forcing TS to bring th thread immediately from paused sate
		
		System.out.println("main end");
	}
}
