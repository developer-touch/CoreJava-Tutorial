package com.ankit.java.staticmethod;

public class Mobile {
	public static void main(String[] args) {
		System.out.println("Mobile.main()::main started");
		System.out.println();
		
		SimCard artel = new Airtel();
		artel.rechargeValid();
		artel.rechargeExpired();
		System.out.println();
		
		SimCard jio = new Jio();
		jio.rechargeValid();
		jio.rechargeExpired();
		System.out.println();
		
		SimCard bsnl = new BSNL();
		bsnl.rechargeValid();
		bsnl.rechargeExpired();
		System.out.println();
		
		System.out.println("Mobile.main()::main ended");
	}
}
