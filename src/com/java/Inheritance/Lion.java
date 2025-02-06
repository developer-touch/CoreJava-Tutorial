package com.java.Inheritance;
public class Lion extends Animal{
	private int age;
	private String action;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void display() {
		System.out.println("Action\t\t :: "+action);
		System.out.println("Age\t\t :: "+age);
	}
	public static void main(String[] args) {
		Lion ln = new Lion();
		ln.setAction("Eating");
		ln.setAge(20);
		
		Animal al = new Animal();
		al.setLeg(2);
		al.setEye(2);
		al.setEar(2);
		al.setAtype("WildAnimal");
		al.setColor("Brown");
		al.displya();
		ln.display();
	}
}
