/***
 * 4.Can we call start() method more than one time ?
 * =>We can't call start() method more than one time but first method is executed
 *   normally when we call next start() method then our program execution is terminate 
 *   abnormally and it leads to RE : java.lang.IllegalStateException.
 */
package com.java.MultiThreading;

class MyThread06 extends Thread{
	@Override
	public void run() {
		for(int i = 20; i>=1; i--) {
			System.out.println("run i :: "+i);
		}
	}
}
public class CallStartMultipleTime {
	public static void main(String[] args) {
		
		MyThread06 th = new MyThread06();
		th.start();
		th.start();
		
		for(int i = 1; i<=20; i++) {
			System.out.println("main i :: "+i);
		}
	}
}
