package com.ankit.java.defaultmethod;

public class CngEngine implements IEngine{
	
	public CngEngine() {
		System.out.println("CngEngine::0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CngEngine.start()::CngEngine started");
	}

	@Override
	public void stop() {
		System.out.println("CngEngine.stop()::CngEngine stoped");
	}
}
