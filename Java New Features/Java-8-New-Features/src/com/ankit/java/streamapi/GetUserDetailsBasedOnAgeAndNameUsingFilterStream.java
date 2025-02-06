package com.ankit.java.streamapi;

import java.util.stream.Stream;

public class GetUserDetailsBasedOnAgeAndNameUsingFilterStream {
	public static void main(String[] args) {
		System.out.println("GetUserDetailsBasedOnAgeAndNameUsingFilterStream.main()::main started");
		User user1 = new User("Ankit", 19);
		User user2 = new User("Raja", 10);
		User user3 = new User("Rani", 16);
		User user4 = new User("John", 20);
		User user5 = new User("Rose", 25);
		User user6 = new User("Ashok", 40);
		User user7 = new User("Natraj", 30);
		Stream<User> userList = Stream.of(user1, user2, user3, user4, user5, user6, user7);

		// Approach first
		/*
		 * Stream<User> filterUser = userList.filter(user -> user.age >= 18 &&
		 * user.name.startsWith("A")); filterUser.forEach(users ->
		 * System.out.println(users));
		 */

		// Approach second
		/*
		 * userList.filter(user->user.age>=18)
		 * .filter(user->user.name.startsWith("A")).forEach(user->System.out.println(
		 * user));
		 * 
		 * System.out.
		 * println("GetUserDetailsBasedOnAgeAndNameUsingFilterStream.main()::main ended"
		 * );
		 */
		// Approch third
		userList.filter(user -> user.age >= 18 && user.name.startsWith("R")).forEach(u -> System.out.println(u));
	}
}

class User {
	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}