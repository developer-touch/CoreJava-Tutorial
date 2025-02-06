/**
 * =>For chaining super class constructors to sub class constructor we must call super class constructor
 *   in sub class constructors by using super() by passing argument matching to parameter type.
 * 
 * =>Calling one constructor from other overloaded constructor in sub class is optional. But calling super
 *   class constructor from sub class constructor is mandatory.
 * 
 * =>In sub class in all constructors, if we don't call super class constructor explicitly calls super class 
 *   no-param constructor by passing super() in sub class.
 */
package com.java.ConstructorChaining;

public class MLC_CC1 {
	MLC_CC1(){
		System.out.println("MLC_CC1 NPC");
	}
	MLC_CC1(int x){
		System.out.println("MLC_CC1 IPC");
	}
}
