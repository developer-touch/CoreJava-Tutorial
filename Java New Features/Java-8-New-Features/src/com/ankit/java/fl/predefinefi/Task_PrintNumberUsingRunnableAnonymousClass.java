package com.ankit.java.fl.predefinefi;

public class Task_PrintNumberUsingRunnableAnonymousClass {
	public static void main(String[] args) {
		System.out.println("Task_PrintNumberUsingRunnableAnonymousClass.main()::main started");
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable.run()::run started");
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
				}
				System.out.println("Runnable.run()::run ended");
			}
		});
		thread.start();
		System.out.println("Task_PrintNumberUsingRunnableAnonymousClass.main()::main ended");
	}
}
