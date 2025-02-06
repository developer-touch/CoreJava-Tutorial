package com.java.ConstructorChaining;

public class Super_Call_CC_02 extends Super_Call_CC_01 {
	Super_Call_CC_02(){
		super(10);
		System.out.println("Super_Call_CC_02 NPC");
	}
	Super_Call_CC_02(int x){
		System.out.println("Super_Call_CC_02 IPC");
	}
}
