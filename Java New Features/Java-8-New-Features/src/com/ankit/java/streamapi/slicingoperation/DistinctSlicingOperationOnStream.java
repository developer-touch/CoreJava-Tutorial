package com.ankit.java.streamapi.slicingoperation;

import java.util.Arrays;
import java.util.List;

public class DistinctSlicingOperationOnStream {
	public static void main(String[] args) {
		System.out.println("SlicingOperationOnStream.main()::main started");
		List<String> nameList = Arrays.asList("Ankit", "Ankita", "Tanu", "Sonu", "Monu", "Tanu", "Ravi", "John");

		// distinct method is used for getting the unique elememts from tthe stream
		// distinct is the terminal operation it doesn't return any value
		nameList.stream().distinct().forEach(name -> System.out.println(name));
		System.out.println();

		User user1 = new User("Ankit", 19);
		User user2 = new User("Amit", 30);
		User user3 = new User("Sonu", 10);
		User user4 = new User("Ankit", 34);
		User user5 = new User("Rose", 20);

		List<String> userList = Arrays.asList(user1.name, user2.name, user3.name, user4.name, user5.name);
		userList.stream().distinct().forEach(user -> System.out.println(user));
		System.out.println("SlicingOperationOnStream.main()::main ended");
	}
}

class User {
	String name;
	int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
