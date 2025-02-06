/***
 * 6.Can we override start() method in Custom Thread ?
 * =>Yes, we can override start() method but it not create new thread
 *   in java stack area so run() method also not executed. 
 */
package com.java.MultiThreading;

class MyThread14 extends Thread{
	@Override
	public void run() {
		System.out.println("run executed");
	}
	
	@Override
	public void start() {
		System.out.println("start executed");
	}
}
public class OverrideStartMethod {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyThread14 th = new MyThread14();
		th.start();
	}
}
