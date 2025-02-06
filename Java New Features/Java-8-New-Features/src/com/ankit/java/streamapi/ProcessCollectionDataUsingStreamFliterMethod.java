package com.ankit.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProcessCollectionDataUsingStreamFliterMethod {
	public static void main(String[] args) {
		System.out.println("ProcessCollectionDataUsingStreamFliterMethod.main()::main started");

		// Approach first
		List<Integer> integerList = Arrays.asList(12, 39, 10, 30, 20, 19, 40);
		Stream<Integer> integerStream = integerList.stream();
		Stream<Integer> integerFilter = integerStream.filter(number -> number >= 18 && number <= 30);
		integerFilter.forEach(num -> System.out.println(num));
		System.out.println();

		// Approach second
		integerList.stream().filter(n -> n >= 18 && n <= 40).forEach(filterList -> System.out.println(filterList));
		System.out.println("ProcessCollectionDataUsingStreamFliterMethod.main()::main ended");
	}
}
