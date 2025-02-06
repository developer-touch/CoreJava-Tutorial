package com.ankit.java.streamapi.matchingoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {
	public static void main(String[] args) {
		Persion p1 = new Persion("Ankit", "INDIA");
		Persion p2 = new Persion("John", "USA");
		Persion p3 = new Persion("Steve", "UK");
		Persion p4 = new Persion("Ching", "CHINA");
		Persion p5 = new Persion("Kumar", "INDIA");

		List<Persion> personList = Arrays.asList(p1, p2, p3, p4, p5);
		Optional<Persion> findFirst = personList.stream().filter(p -> p.country.equals("INDIA")).findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}
}

class Persion {
	String name;
	String country;

	public Persion(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Persion [name=" + name + ", country=" + country + "]";
	}

}