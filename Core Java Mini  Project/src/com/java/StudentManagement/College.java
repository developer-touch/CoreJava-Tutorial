package com.java.StudentManagement;

public class College {
	public static void main(String[] args) {
		StudentManagement sms = new StudentManagement();
		
		//create new student 
		sms.addNewStudent(new StudentDTO(101,"Ankit","Java","A"));
		sms.addNewStudent(new StudentDTO(102,"Sonu","Oracle","B"));
		sms.addNewStudent(new StudentDTO(103,"Tanu","HTML","A"));
		sms.addNewStudent(new StudentDTO(104,"Monu","AdvJava","A++"));
		
		sms.showStudentReords();
	}
}



