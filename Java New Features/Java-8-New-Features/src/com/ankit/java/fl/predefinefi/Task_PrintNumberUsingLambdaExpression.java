package com.ankit.java.fl.predefinefi;

public class Task_PrintNumberUsingLambdaExpression {
	public static void main(String[] args) {
		System.out.println("Task_PrintNumberUsingLambdaExpression.main()::main started");
		Runnable runnable = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("Task_PrintNumberUsingLambdaExpression.main()::main ended");
	}
}
