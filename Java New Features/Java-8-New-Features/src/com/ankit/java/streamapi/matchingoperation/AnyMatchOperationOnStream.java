package com.ankit.java.streamapi.matchingoperation;

import java.util.Arrays;
import java.util.List;

public class AnyMatchOperationOnStream {
	public static void main(String[] args) {
		System.out.println("AnyMatchOperationOnStream.main()::main started");
		List<String> nameList = Arrays.asList("Ankit", "Monu", "sonu", "Ankit", "Raj", "monu");

		// anyMatch is the matching operation it is used to match the given elements to
		// stream elements if the available then it return true else retuen false
		// anyMatch method always return boolean value and takes the Predicate as the
		// parameter
		boolean status = nameList.stream().anyMatch(name -> name.equalsIgnoreCase("ankit"));
		System.out.println("Any Name Availavle ? " + status);

		User user1 = new User("Ankit", 19);
		User user2 = new User("Amit", 30);
		User user3 = new User("Sonu", 10);
		User user4 = new User("Ankit", 34);
		User user5 = new User("Rose", 20);

		List<String> userList = Arrays.asList(user1.name, user2.name, user3.name, user4.name, user5.name);
		boolean status2 = userList.stream().anyMatch(name -> name.startsWith("A"));
		System.out.println("Is Any Available? " + status2);
		boolean status3 = userList.stream().anyMatch(user->user.contains("Ankit"));
		System.out.println(status3);
		System.out.println("AnyMatchOperationOnStream.main()::main ended");
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
