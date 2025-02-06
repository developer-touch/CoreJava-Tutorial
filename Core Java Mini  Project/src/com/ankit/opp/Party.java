package com.ankit.opp;

public class Party{
	public void eat(Person p) {
		System.out.println(p.getName()+" is in party");
		p.eat();
		p.sleep();
	}

}
