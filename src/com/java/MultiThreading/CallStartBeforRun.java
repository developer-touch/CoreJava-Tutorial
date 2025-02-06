/***
 * 3.What is the output when we call start() method before run() method in program ?
 * =>When we call start() method before run() method then its logic is executed concurrently due to start() 
 *   method call.
 */
package com.java.MultiThreading;

class MyThread05 extends Thread{
	@Override
	public void run() {
		for(int i = 50; i>=1; i--) {
			System.out.println("run i :: "+i);
		}
	}
}
public class CallStartBeforRun {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread05 th = new MyThread05();
		th.start();
		th.run();
		
		for(int i = 1; i<=50; i++) {
			System.out.println("main i "+i);
		}
		System.out.println("main end");
	}
}