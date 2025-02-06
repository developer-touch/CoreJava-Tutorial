package com.ankit.java.streamapi.slicingoperation;

import java.util.Arrays;
import java.util.List;

public class LimitSlicingOperationOnStream {
	public static void main(String[] args) {
		System.out.println("LimitSlicingOperationOnStream.main()::main started");
		List<Integer> integerList = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 100);

		// limit is used to get element from the stream based on the given size
		integerList.stream().limit(4).forEach(number -> System.out.println(number));

		User user1 = new User("Ankit", 19);
		User user2 = new User("Amit", 30);
		User user3 = new User("Sonu", 10);
		User user4 = new User("Ankit", 34);
		User user5 = new User("Rose", 20);

		List<String> userList = Arrays.asList(user1.name, user2.name, user3.name, user4.name, user5.name);
		userList.stream().limit(4).forEach(name -> System.out.println(name));
		System.out.println("LimitSlicingOperationOnStream.main()::main ended");
	}
}
