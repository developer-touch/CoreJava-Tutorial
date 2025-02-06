package com.ankit.java.parallelstream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		System.out.println("ParallelStreamDemo.main()::main started");

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("==========Serial Stream=============");
		numberList.stream().forEach(number -> System.out.println(number));

		System.out.println("==========Parallel Stream=============");
		numberList.parallelStream().forEach(number -> System.out.println(number));

		System.out.println("ParallelStreamDemo.main()::main ended");
	}
}
