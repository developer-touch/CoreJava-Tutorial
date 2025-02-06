package com.ankit.java.fl.predefinefi;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable.run()::run started");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}

public class Task_PrintNumberUsingRunnableInterface {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread th = new Thread(runnable);
		th.start();
	}
}

/*
 * Task print 1 to five using Thread or Runnable in 3 Approch
 */
