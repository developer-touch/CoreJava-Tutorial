package com.java.MultiThreading;

class MyThread18 extends Thread{
	@Override
	public void run() {
		System.out.println("run start");
		System.out.println(getState());
		
		try {
			Thread.sleep(2000);		//TIMED_WAIT
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("run end");
	}
}
public class ThreadLifeCycle {
	public static void main(String[] args) throws InterruptedException {
		MyThread18 th = new MyThread18();
		System.out.println(th.getState()); //NEW
		
		th.start();
		System.out.println(th.getState()); //RUNNABLE (Ready-to-run)
		
		Thread.sleep(2000);  //pausing main thread for allowing th to execute
		
		System.out.println(th.getState());
		Thread.sleep(3000);  //pausing main thread for allowing th to resume amd execute to run
		
		System.out.println(th.getState());
	}
}
