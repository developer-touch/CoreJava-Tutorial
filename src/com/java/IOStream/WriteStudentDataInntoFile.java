package com.java.IOStream;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class WriteStudentDataInntoFile {
	public static void main(String[] args)throws FileNotFoundException ,IOException {
		
		StudentData sd = new StudentData();
		sd.setSno(101); 
		sd.setSname("Ankit");
		sd.setCourse("Java");
		sd.setFee(3500);
		sd.setEmail("ankitraj@1234");
		sd.setMobile(9135660261L);
		sd.setGender('M');
		sd.setStudying(true);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentObject.ser")); //serialization
		oos.writeObject(sd);
		oos.flush();
		System.out.println("Object data is saved.");
		oos.close();
	}
}
