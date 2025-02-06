package com.ankit.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class ProcessCollectionDataBeforStream {
	public static void main(String[] args) {
		System.out.println("ProcessCollectionDataBeforStream.main()::main started");

		List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

		for (Integer i : numberList) {
			if (i > 20) {
				System.out.println(i);
			}
		}

		System.out.println();
		List<String> nameList = Arrays.asList("Ankit", "Monu", "Tanu", "Ravi", "Abhi", "Garima", "Sara", "Mohit");

		for (String name : nameList) {
			if (name.startsWith("A")) {
				System.out.println(name);
			}
		}
		System.out.println("ProcessCollectionDataBeforStream.main()::main ended");
	}
}
