package com.ankit.java.optionalclass;

import java.util.Optional;

public class UserByOptionalClass {
	public Optional<String> getUserName(Integer id) {
		System.out.println("UserByOptionalClass.getUserName()");
		String name = null;
		if (id == 100) {
			name = "Ankit";
		} else if (id == 101) {
			name = "Monu";
		} else if (id == 102) {
			name = "Sonu";
		} else if (id == 103) {
			name = "Vicky";
		}
		return Optional.ofNullable(name);
	}
}
