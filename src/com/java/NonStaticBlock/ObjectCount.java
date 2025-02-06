package com.java.NonStaticBlock;

public class ObjectCount { 
	static int count = 0;
	{
		count++;
	}
	ObjectCount(){
		System.out.println("NPC is created...");
	}
	ObjectCount(int x){
		System.out.println("IPC is created...");
	}
	ObjectCount(String s){
		System.out.println("SPC is created...");
	}
	ObjectCount(Object obj){
		System.out.println("CPC is created...");
	}
	public static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		ObjectCount oc1 = new ObjectCount();
		ObjectCount oc2 = new ObjectCount(4);
		ObjectCount oc3 = new ObjectCount("a");
		ObjectCount oc4 = new ObjectCount(new ObjectCount());
		System.out.println("Object Created.."+ObjectCount.getCount());
	}
}
