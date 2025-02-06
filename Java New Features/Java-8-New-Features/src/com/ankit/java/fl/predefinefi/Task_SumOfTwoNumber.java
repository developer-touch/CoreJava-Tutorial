package com.ankit.java.fl.predefinefi;

import java.util.function.BiFunction;

public class Task_SumOfTwoNumber {
	public static void main(String[] args) {
		System.out.println("Task_SumOfTwoNumber.main()::main started");
		
		BiFunction<Integer, Integer, Integer> sum = (number1, number2) -> number1 + number2;
		System.out.println(sum.apply(20, 30));
		
		System.out.println("Task_SumOfTwoNumber.main()::main ended");
	}
}
