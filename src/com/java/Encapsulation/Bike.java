package com.java.Encapsulation;

public class Bike {
	private int gear;
	
	public void setGear(int gear) throws IllegalArgumentException{
		if(gear < 0 || gear> 5)
			throw new IllegalArgumentException("Invalid Gear :: ");
		this.gear = gear;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void currentGear() {
		if(gear == 0)
			System.out.println("Bike is neutral :: ");
		else
			System.out.println("Bike in running on gear :: "+gear);
	}
}
