package com.ankit.java.optionalclass;

import java.util.Optional;
import java.util.Scanner;

public class SolutionOfNpeByOptionalClass {
	public static void main(String[] args) {
		System.out.println("SolutionOfNpeByOptionalClass.main()::main started");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter User ID :: ");
		int userId = scanner.nextInt();

		UserByOptionalClass user = new UserByOptionalClass();
		Optional<String> userName = user.getUserName(userId);

		//if data present in optional then true else false
		if (userName.isPresent()) {
			//to get data from optional
			String name = userName.get();
			System.out.println(name.toUpperCase() + ",HELLO");
		} else {
			System.out.println("No Data Found");
		}
	}
}
