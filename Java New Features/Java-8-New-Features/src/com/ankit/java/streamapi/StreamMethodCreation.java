package com.ankit.java.streamapi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamMethodCreation {
	public static void main(String[] args) {
		System.out.println("StreamMethodCreation.main()::main started");
		// first approach
		Stream<Integer> numberList = Stream.of(10, 20, 30, 40, 50);
		numberList.forEach(number -> System.out.println(number));

		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("ankit");
		nameList.add("monu");
		nameList.add("pooja");
		nameList.add("raja");
		nameList.add("rani");
		nameList.add("john");

		// second approach
		Stream<String> nameStream = nameList.stream();
		nameStream.forEach(name -> System.out.println(name));

		System.out.println("StreamMethodCreation.main()::main ended");
	}
}
