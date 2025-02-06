package com.java.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudentDataInntoFile {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("StudentObject.ser"));
		Object object = ois.readObject();	//de-serialization
		System.out.println(object);
		System.out.println();
		
		StudentData sd1 = (StudentData)object;
		System.out.println("Student No::"+sd1.getSno());
		System.out.println("Student Name::"+sd1.getSname());
	}
}
