package com.ankit.java.fl.predefinefi;

import java.util.function.BiPredicate;

public class BiPredicate_BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bip = (i, j) -> (i + j) >= 20;
		System.out.println(bip.test(20, 2));
	}
}
