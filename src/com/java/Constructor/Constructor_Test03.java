package com.java.Constructor;

public class Constructor_Test03 {
	private int x;
	private int y;
	
	Constructor_Test03(){
		System.out.println("npc executed");
	}
	
	Constructor_Test03(int x,int y){
		System.out.println("ipc execcuted");
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		System.out.println("main executed");
		
		Constructor_Test03 c1 = new Constructor_Test03();
		
		Constructor_Test03 c2 = new Constructor_Test03(10,20);
		
		System.out.println("X :: "+c1.x+" "+"Y :: "+c1.y);
		
		System.out.println("X :: "+c2.x+" "+"Y :: "+c2.y);
	}
}
