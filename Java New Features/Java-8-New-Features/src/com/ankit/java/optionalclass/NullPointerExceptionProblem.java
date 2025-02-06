package com.ankit.java.optionalclass;

import java.util.Scanner;

public class NullPointerExceptionProblem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter User Id :: ");
		int userId = scanner.nextInt();

		User user = new User();
		String userName = user.getUserNameById(userId);
		
		if (userName != null) {
			System.out.println(userName.toUpperCase() + ",HELLO");
		} else {
			System.out.println("Invalid ID");
		}
		/* System.out.println(user.getUserNameById(userId).toUpperCase() + ",Hello"); */
	}
}
