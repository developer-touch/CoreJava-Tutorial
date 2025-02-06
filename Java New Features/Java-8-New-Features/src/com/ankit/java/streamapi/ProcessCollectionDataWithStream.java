package com.ankit.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProcessCollectionDataWithStream {
	public static void main(String[] args) {
		System.out.println("ProcessCollectionDataWithStream.main()::main started");
		
		List<String> nameList = Arrays.asList("Ankit", "Anshu", "Ravi", "Sonu", "Dipanshu", "Sahil", "Niraj");
		Stream<String> nameStream = nameList.stream();
		Stream<String> filterName = nameStream.filter(name -> name.startsWith("A"));
		filterName.forEach(name -> System.out.println(name));
		
		System.out.println("ProcessCollectionDataWithStream.main()::main ended");
	}
}
