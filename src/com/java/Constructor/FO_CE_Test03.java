package com.java.Constructor;

public class FO_CE_Test03 {
	FO_CE_Test03(){
		System.out.println("NPC executed");
	}
	FO_CE_Test03(int x){
		System.out.println("IPC executed");
	}
	public static void main(String[] args) {
		System.out.println("main executed");
		FO_CE_Test03 c = new FO_CE_Test03();
	}
}
