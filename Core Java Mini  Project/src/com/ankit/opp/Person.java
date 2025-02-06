package com.ankit.opp;

public class Person {
	
	private static int eyes;
	private static int ears;
	private static int hand;
	private static int legs;
	
	private String name;
	private double height;
	private double weight;
	
	static {
		eyes = 2;
		ears = 2;
		hand = 2;
		legs = 2;
	}
	
	private static int count;
	{
		count++;
	}
	
	public Person(String name,double height,double weight){
		this.name   = name;
		this.height = height;
		this.weight = weight;
	}
	
	public static void setEyes(int eyes) {
		Person.eyes = eyes;
	}
	public static int getEyes() {
		return eyes;
	}
	
	public static void setEar(int ears) {
		Person.ears= ears;
	}
	public static int getEars() {
		return ears;
	}
	
	public static void setHands(int hand) {
		Person.hand= hand;
	}
	public static int getHands() {
		return hand;
	}
	
	public static void setLegs(int legs) {
		Person.legs= legs;
	}
	public static int getLegs() {
		return legs;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getweight() {
		return weight;
	}
	public void eat() {
		System.out.println(getName()+" is eating in party");
	}
	public void sleep() {
		System.out.println(getName()+ " is sleeping");
	}
	public void learn() {
		System.out.println(getName()+ " is learning ");
	}
	public String toString() {
		return "Person Details"+
					"\nEyes\t 	:: " + eyes+
					"\nEars\t 	:: " + ears+
					"\nHand\t 	:: " + hand+
					"\nLegs\t 	:: " + legs+
					"\nName\t 	:: " + name+
					"\nHeight\t :: " + height+
					"\nWeight\t :: " + weight;
	}
}
