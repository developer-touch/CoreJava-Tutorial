package com.ankit.java.optionalclass;

public class User {
	public String getUserNameById(Integer id) {
		System.out.println("User.getUserNameById()");
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else if (id == 102) {
			return "Ankit";
		} else if (id == 103) {
			return "Monu";
		} else {
			return null;
		}
	}
}
