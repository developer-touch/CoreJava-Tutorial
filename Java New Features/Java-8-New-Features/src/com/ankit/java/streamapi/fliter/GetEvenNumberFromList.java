package com.ankit.java.streamapi.fliter;

import java.util.Arrays;
import java.util.List;

public class GetEvenNumberFromList {
	public static void main(String[] args) {
		System.out.println("GetEvenNumberFromList.main()::main started");
		List<Integer> numberList = Arrays.asList(12, 11, 23, 34, 15, 20, 2, 14, 3);
		numberList.stream().filter(number -> number % 2 == 0).forEach(even -> System.out.println(even));
		System.out.println("GetEvenNumberFromList.main()::main ended");
	}
}
