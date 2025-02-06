package com.ankit.java.staticmethod;

public interface SimCard {
	public abstract void rechargeValid();
	public abstract void rechargeExpired();
	public static boolean isSupported() {
		System.out.println("The sim-carded is supported by the current mobile");
		return true;
	}
}
