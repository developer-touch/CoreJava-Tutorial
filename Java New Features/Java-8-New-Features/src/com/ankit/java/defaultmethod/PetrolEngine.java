package com.ankit.java.defaultmethod;

public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.start()::PetrolEngine started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()::PetrolEngine stoped");
	}
	
	@Override
	public void move() {
		IEngine.super.move();
		System.out.println("PetrolEngine.moved()::PetrolEngine moved");
		IEngine.super.move();
	}
}
