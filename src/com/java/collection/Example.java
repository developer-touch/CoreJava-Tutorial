package com.java.collection;

//POJO class
public class Example {
	// Properties
	private int x;
	private int y;
	//Setter and Getter method
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Example("+x+", "+y+")";
	}
}
