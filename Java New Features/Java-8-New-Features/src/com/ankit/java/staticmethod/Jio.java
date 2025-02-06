package com.ankit.java.staticmethod;

public class Jio implements SimCard{
	
	public Jio() {
		System.out.println("Jio::0-param constructor");
		SimCard.isSupported();
	}
	
	@Override
	public void rechargeValid() {
		System.out.println("Jio.rechargeValid::Your Jio Recharge Valid");
	}

	@Override
	public void rechargeExpired() {
		System.out.println("Jio.rechargeExpired::Your Jio Recharge Exprired");
	}

}
