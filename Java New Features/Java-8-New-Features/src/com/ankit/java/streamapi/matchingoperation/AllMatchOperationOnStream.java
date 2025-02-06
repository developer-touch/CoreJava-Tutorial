package com.ankit.java.streamapi.matchingoperation;

import java.util.Arrays;
import java.util.List;

public class AllMatchOperationOnStream {
	public static void main(String[] args) {
		System.out.println("AllMatchOperationOnStream.main()::main started");
		List<String> nameList = Arrays.asList("Ankit", "Monu", "sonu", "Ankit", "Raj", "monu");
		boolean nameStatus = nameList.stream().allMatch(name -> name.equals("Ankit"));
		System.out.println("All Match Available? " + nameStatus);

		User user1 = new User("Ankit", 19);
		User user2 = new User("Amit", 30);
		User user3 = new User("Sonu", 10);
		User user4 = new User("Ankit", 34);
		User user5 = new User("Rose", 20);

		List<String> userList = Arrays.asList(user1.name, user2.name, user3.name, user4.name, user5.name);
		boolean nameStatus2 = userList.stream().allMatch(name -> name.startsWith("A"));
		System.out.println("All Match Available ? " + nameStatus2);
		System.out.println("AllMatchOperationOnStream.main()::main ended");
	}
}
