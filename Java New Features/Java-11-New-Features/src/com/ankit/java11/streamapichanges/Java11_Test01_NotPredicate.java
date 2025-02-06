package com.ankit.java11.streamapichanges;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11_Test01_NotPredicate {
	public static void main(String[] args) {
		System.out.println("Java11_Test01_NotPredicate.main()");
		List<String> employeeList = Arrays.asList("Ankit","Mohan","Sonu","Rahul","Raja","Rani"+"\n"+" ");
		employeeList.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
