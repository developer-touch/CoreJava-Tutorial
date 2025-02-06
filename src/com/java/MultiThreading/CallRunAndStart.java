/***
 * 2.What it output when we call both run and start method in main method ?
 * =>When we call run() and start() method both then run() method execute two time first in main thread
 *   then execute from the user defined thread in Java Stack Area.
 */
package com.java.MultiThreading;

class MyThread04 extends Thread{
	@Override
	public void run() {
		for(int i = 20; i>=1; i--) {
			System.out.println("run i :: "+i);
		}
	}
}
public class CallRunAndStart {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread04 th =  new MyThread04();
		th.run();
		th.start();
		
		for(int i = 1; i<=20; i++) {
			System.out.println("main i :: "+i);
		}
	}
}
