package com.java.Constructor;

public class FO_CE_Test02 {
	FO_CE_Test02(){
		System.out.println("NPC executed");
	}
	
	public static void main(String[] args) {
		System.out.println("main excuted");
		
		FO_CE_Test02 c = new  FO_CE_Test02();
	}
}
