package com.ankit.java.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
	public static void main(String[] args) {
		System.out.println("SpliteratorDemo.main()::main started");
		List<String> stringList = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
		Spliterator<String> spliterator = stringList.stream().spliterator();
		spliterator.forEachRemaining(s -> System.out.println(s));
		System.out.println("SpliteratorDemo.main()::main started");
	}
}
