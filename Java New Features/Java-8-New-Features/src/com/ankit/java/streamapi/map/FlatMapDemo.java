package com.ankit.java.streamapi.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		System.out.println("FlatMapDemo.main()::main started");

		List<String> javaCourses = Arrays.asList("core java", "adv java", "spring", "springboot");
		List<String> uiCourses = Arrays.asList("html", "css", "bootstrap", "javascript");

		List<List<String>> courses = Arrays.asList(javaCourses, uiCourses);
		/* courses.stream().forEach(course -> System.out.println(course)); */

		Stream<String> courseStream = courses.stream().flatMap(s -> s.stream());
		courseStream.forEach(c -> System.out.println(c.toUpperCase()));

		System.out.println("FlatMapDemo.main()::main ended");
	}
}
