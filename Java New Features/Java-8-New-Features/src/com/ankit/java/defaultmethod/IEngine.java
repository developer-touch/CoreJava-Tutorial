package com.ankit.java.defaultmethod;

public interface IEngine {
	public abstract void start();
	public default void move() {
		System.out.println("IEngine.move()::IEngine moved");
	}
	public abstract void stop();
}	
