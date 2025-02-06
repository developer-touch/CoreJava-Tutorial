package com.ankit.java.defaultmethod;

public class Vehicle {
	public static void main(String[] args) {
		System.out.println("Vehicle.main()::main started");
		System.out.println();

		IEngine petrolEngine = new PetrolEngine();
		petrolEngine.start();
		petrolEngine.stop();
		petrolEngine.move();
		System.out.println();

		IEngine dieselEngine = new DieselEngine();
		dieselEngine.start();
		dieselEngine.stop();
		System.out.println();

		IEngine cngEngine = new CngEngine();
		cngEngine.start();
		cngEngine.stop();
		System.out.println();

		System.out.println("Vehicle.main()::main ended");
	}
}
