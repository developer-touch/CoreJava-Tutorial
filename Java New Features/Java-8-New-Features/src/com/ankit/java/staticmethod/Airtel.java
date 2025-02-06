package com.ankit.java.staticmethod;

public class Airtel implements SimCard{

	public Airtel() {
		System.out.println("Airtel::0-param constructor");
		SimCard.isSupported();
	}
	
	@Override
	public void rechargeValid() {
		System.out.println("Airtel.rechargeValid::Your Airtel Recharge Valid");
	}

	@Override
	public void rechargeExpired() {
		System.out.println("Airtel.rechargeExpired::Your Airtel Recharge Exprired");
	}
}
