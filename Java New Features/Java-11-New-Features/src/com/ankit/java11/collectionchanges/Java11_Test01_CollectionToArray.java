package com.ankit.java11.collectionchanges;

import java.util.Arrays;
import java.util.List;

public class Java11_Test01_CollectionToArray {
	public static void main(String[] args) {
		System.out.println("Java11_Test01_CollectionToArray.main()");
		List<String> courseList = Arrays.asList("Java", "Pythan", "JavaScript", ".Net");
		
		String[] course = courseList.toArray(new String[courseList.size()]);
		System.out.println(course.length);
		
		for (String data : course) {
			System.out.print(data + " ");
		}
		System.out.println();
		courseList.stream().iterator().forEachRemaining(System.out::print);
	}
}
