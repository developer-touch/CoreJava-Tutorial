package com.ankit.java.fl.predefinefi;

import java.util.function.Predicate;

public class Predicates_TestNumberUsingPredicates {
	public static void main(String[] args) {
		System.out.println("TestNumberUsingPredicates.main()::main started");
		Predicate<Integer> number = i -> i > 10;
		System.out.println(number.test(1));
		System.out.println(number.test(9));
		System.out.println(number.test(10));
		System.out.println(number.test(15));

		System.out.println("<--------------------************------------------->");

		int[] ages = { 12, 30, 49, 18, 20 };
		Predicate<Integer> age = a -> a >= 18;
		for (Integer returnAge : ages) {
			if (age.test(returnAge)) {
				System.out.println(returnAge);
			}
		}

		System.out.println("TestNumberUsingPredicates.main()::main ended");
	}

}
