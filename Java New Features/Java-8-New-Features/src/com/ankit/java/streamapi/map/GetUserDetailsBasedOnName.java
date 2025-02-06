package com.ankit.java.streamapi.map;

import java.util.Arrays;
import java.util.List;

public class GetUserDetailsBasedOnName {
	public static void main(String[] args) {
		System.out.println("GetUserDetailsBasedOnName.main()::main started");
		User user1 = new User("Ashok", 26);
		User user2 = new User("Raja", 40);
		User user3 = new User("Ankit", 19);
		User user4 = new User("Rani", 26);
		User user5 = new User("Akash", 29);

		List<User> userList = Arrays.asList(user1, user2, user3, user4, user5);
		userList.stream().filter(user -> user.userName.startsWith("A"))
				.map(user -> user.userName.length() + "--" + user).forEach(user -> System.out.println(user));
		System.out.println("GetUserDetailsBasedOnName.main()::main ended");
	}
}

class User {
	String userName;
	int userAge;

	public User(String userName, int userAge) {
		super();
		this.userName = userName;
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User => [UserName = " + userName + ",UserAge = " + userAge + "]";
	}
}
