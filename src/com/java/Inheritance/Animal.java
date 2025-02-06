package com.java.Inheritance;

public class Animal {
	private int leg;
	private int eye;
	private int ear;
	private String atype;
	private String color;
	
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public int getEye() {
		return eye;
	}
	public void setEye(int eye) {
		this.eye = eye;
	}
	public int getEar() {
		return ear;
	}
	public void setEar(int ear) {
		this.ear = ear;
	}
	
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void displya() {
		System.out.println("Leg\t\t :: "+leg);
		System.out.println("Eye\t\t :: "+eye);
		System.out.println("Ear\t\t :: "+ear);
		System.out.println("Atype\t\t :: "+atype);
		System.out.println("Color\t\t :: "+color);
	}
}
