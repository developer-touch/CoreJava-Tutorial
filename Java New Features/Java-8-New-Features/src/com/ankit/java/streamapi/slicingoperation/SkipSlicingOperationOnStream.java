package com.ankit.java.streamapi.slicingoperation;

import java.util.Arrays;
import java.util.List;

public class SkipSlicingOperationOnStream {
	public static void main(String[] args) {
		System.out.println("SkipSlicingOperationOnStream.main()::main started");
		List<Integer> integerList = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 100);

		// skip is used to get elements from the stream based on the given number
		// it will skip the geven number after remaining number it will return
		integerList.stream().skip(3).forEach(skipNumber -> System.out.println(skipNumber));
		System.out.println();

		User user1 = new User("Ankit", 19);
		User user2 = new User("Amit", 30);
		User user3 = new User("Sonu", 10);
		User user4 = new User("Ankit", 34);
		User user5 = new User("Rose", 20);

		List<Integer> userList = Arrays.asList(user1.age, user2.age, user3.age, user4.age, user5.age);
		userList.stream().skip(2).forEach(skipAge -> System.out.println(skipAge));
		System.out.println("SkipSlicingOperationOnStream.main()::main ended");
	}
}
