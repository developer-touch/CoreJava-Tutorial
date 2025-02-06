package com.ankit.java.defaultmethod;

public final class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine::0-param constructor");
	}
	
	@Override
	public void start() {
		System.out.println("DieselEngine.start()::DieselEngine started");
		IEngine.super.move();
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()::DieselEngine stoped");
		IEngine.super.move();
	}
	
}
