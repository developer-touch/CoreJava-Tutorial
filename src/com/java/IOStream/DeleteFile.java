package com.java.IOStream;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DeleteFile {
	public static void main(String[] args) {
		File f1 = new File("ABC.txt");
		System.out.println(f1.delete());
		
		File f2 = new File("Product.txt\\ProductName.txt");
		System.out.println(f2.delete());
		
		File f3 = new File("Product.txt");
		System.out.println(f3.delete());
	}
}
