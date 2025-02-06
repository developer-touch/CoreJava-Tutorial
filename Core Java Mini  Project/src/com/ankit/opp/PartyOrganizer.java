package com.ankit.opp;

public class PartyOrganizer {
	public static void main(String[] args) {

		Student s1 = new Student("Ankit", 6, 50, 1001, "Java", 100);
		System.out.println(s1);

		System.out.println("===================================================");

		Party party = new Party();
		party.eat(s1);

		System.out.println("===================================================");

		s1.read();
		s1.reply();
		s1.write();

		System.out.println("===================================================");

		Person p1 = new Person("Ankit", 6, 50);
		System.out.println(p1);

		p1.sleep();
		p1.eat();
		p1.learn();

		System.out.println("===================================================");
	}
}
