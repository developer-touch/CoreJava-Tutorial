package com.ankit.java.staticmethod;

public class BSNL implements SimCard{
	
	public BSNL() {
		System.out.println("BSNL::0-param constructor");
		SimCard.isSupported();
	}
	
	@Override
	public void rechargeValid() {
		System.out.println("BSNL.rechargeValid::Your BSNL Recharge Valid");
	}

	@Override
	public void rechargeExpired() {
		System.out.println("BSNL.rechargeExpired::Your BSNL Recharge Exprired");
	}
}
