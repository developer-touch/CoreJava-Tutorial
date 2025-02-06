package com.ankit.java.fl.predefinefi;

import java.util.function.Supplier;

public class Supplier_RandomCodeGenerator {
	public static void main(String[] args) {
		System.out.println("Supplier_RandomCodeGenerator.main()::main started");
		
		Supplier<String> s = ()->{
			String otp = "";
			for(int i=1; i<=5; i++) {
				otp = otp + (int) (Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println("Supplier_RandomCodeGenerator.main()::main ended");
	}
}
