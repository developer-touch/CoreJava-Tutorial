package com.java.MethodOverloading;

public class MOVL_Demo_Test {
	public static void main(String[] args) {
		MOVL_Demo md = new MOVL_Demo();
		
		md.add(4, 0);	// ->add(int,int)
		
		md.add(40, 40.0f); // ->add(int,double)->(int,float)
		
		md.add('a', 'b');  // ->add(int,int)
		
		//md.add(10.5, 20.5); 
		
		md.add(10.5F, 20.5F); //->add(float,float)
		
		md.add(5L, 6L);	//->add(float,float)
		
		md.add(6F, 5L);	//->add(float,float)
	}
}
