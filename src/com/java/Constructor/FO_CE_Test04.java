package com.java.Constructor;

public class FO_CE_Test04 {
	FO_CE_Test04(int x){
		System.out.println("IPC executed");
	}
	public static void  main(String[] args) {
		System.out.println("main executed");
		//FO_CE_Test04 c = new FO_CE_Test04();
		FO_CE_Test04 c = new FO_CE_Test04(3);
	}
}
