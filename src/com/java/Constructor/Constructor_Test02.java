package com.java.Constructor;

public class Constructor_Test02 {
	private int x ;
	private int y ;
	
	Constructor_Test02(){
		System.out.println("NPC executed");
		x = 10;
		y = 20;
	}
	
	public static void main(String[] args) {
		System.out.println("main exeuted");
		
		Constructor_Test02 c1 = new Constructor_Test02();
		
		Constructor_Test02 c2 = new Constructor_Test02();
		
		System.out.println("X :: "+c1.x + " "+"Y :: "+c1.y);
		
		System.out.println("X :: "+c2.x+ " "+"Y :: "+c2.y);
	}
	
}
