package com.ankit.java.fl.predefinefi;

import java.util.function.BiConsumer;

public class BiConsumer_BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<Integer , Integer> bic = (i,j) -> System.out.println((i+j)*2);
		bic.accept(20, 10);
	}
}
