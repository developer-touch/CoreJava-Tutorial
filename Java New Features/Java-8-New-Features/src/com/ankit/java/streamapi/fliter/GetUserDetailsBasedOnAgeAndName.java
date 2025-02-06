package com.ankit.java.streamapi.fliter;

import java.util.Arrays;
import java.util.List;

public class GetUserDetailsBasedOnAgeAndName {
	public static void main(String[] args) {
		System.out.println("GetUserDetailsBasedOnAgeAndName.main()::main started");
		User user1 = new User(1111, "Ankit", 19, 9135660261L);
		User user2 = new User(2222, "Monu", 10, 8546123654L);
		User user3 = new User(3333, "Sonu", 11, 78945612301L);
		User user4 = new User(4444, "Anshu", 14, 7891234568L);
		User user5 = new User(5555, "Rani", 24, 9632587410L);
		User user6 = new User(6666, "Raju", 30, 14785233692L);
		User user7 = new User(7777, "Raja", 54, 2586361475L);
		User user8 = new User(8888, "John", 50, 4569871232L);
		List<User> userList = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8);
		
		userList.stream().filter(userDetail -> userDetail.userAge >= 18 && userDetail.userAge <= 40)
				.filter(userDetail -> userDetail.userName.startsWith("R"))
				.forEach(user -> System.out.println(user));
		
		System.out.println("GetUserDetailsBasedOnAgeAndName.main()::main ended");
	}
}

class User {
	int userId;
	String userName;
	int userAge;
	long userMobile;

	public User(int userId, String userName, int userAge, long userMobile) {
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userMobile = userMobile;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userMobile="
				+ userMobile + "]";
	}

}