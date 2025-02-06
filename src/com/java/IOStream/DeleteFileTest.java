package com. java.IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteFileTest {
	public static void main(String[] args) {
		File f1 = new File("Product.txt");
		System.out.println(f1.delete());
	}
}
