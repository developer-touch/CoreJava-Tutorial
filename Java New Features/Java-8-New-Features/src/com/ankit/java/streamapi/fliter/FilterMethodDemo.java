package com.ankit.java.streamapi.fliter;

import java.util.Arrays;
import java.util.List;

public class FilterMethodDemo {
	public static void main(String[] args) {
		System.out.println("FilterMethodDemo.main()::main started");
		List<Integer> numberList = Arrays.asList(12, 23, 11, 24, 45, 20, 10);
		numberList.stream().filter(evenNumber -> evenNumber % 2 == 0)
				.forEach(even -> System.out.println("Even->" + even));
		System.out.println("FilterMethodDemo.main()::main ended");
	}
}
