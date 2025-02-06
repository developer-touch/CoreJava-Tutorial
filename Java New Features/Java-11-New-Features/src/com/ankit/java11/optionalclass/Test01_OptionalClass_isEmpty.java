package com.ankit.java11.optionalclass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test01_OptionalClass_isEmpty {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Ankit","Monu","Sonu","Raja","Rani");
		Optional<List<String>> listOfString =  Optional.ofNullable(nameList);
		
		// before java 11
		if (listOfString.isPresent()) {
			System.out.println("List is not empty");
			nameList.forEach(System.out::println);
		}
		else {
			System.out.println("List is empty");
		}
		
		System.out.println();
		
		// from java 11
		if (listOfString.isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			System.out.println("list is not empty");
			nameList.stream().spliterator().forEachRemaining(System.out::println);
		}
	}
}
