/***
 * 1.Can we call run method directly from main method ?
 * =>Yes, We can call run method from main method directly but in this situation
 *   user defined thread is not created in Java Stack Area.It is executed in 
 *   main method.    
 */
package com.java.MultiThreading;

class MyThread03 extends Thread{
	@Override
	public void run() {
		for(int i = 20; i>=1; i--) {
			System.out.println("run i :: "+i);
		}
	}
}
public class CallRunMethod {
	public static void main(String[] args) {
		MyThread03 th = new MyThread03();
		th.run();
		
		for(int i=1; i<=20; i++) {
			System.out.println("main i :: "+i);
		}
	}
}
