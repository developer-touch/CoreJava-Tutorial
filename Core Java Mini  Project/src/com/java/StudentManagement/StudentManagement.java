package com.java.StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
	/*
	 * we use ArrayList because ArrayList has not fixed size and here we pass
	 * student class object data
	 */	
	private List<StudentDTO> studentlist = new ArrayList<>();
	
	/* we create addStudent method to add new Student in this ArrayList */
	public void addNewStudent(StudentDTO student) {
		studentlist.add(student);
	}
	
	/* to show how many student present in this ArrayList */
	public void showStudentReords() {
		studentlist.forEach(System.out::println);
	}
	
	/* to update ArrayList student object data */	
	public void updateStudentRecords(int sno,String newName,String newCourse,String newGrade) {
		for(StudentDTO student : studentlist) {
			if(student.getSno()==sno)
			{
				student.setSname(newName);
				student.setCourse(newCourse);
				student.setGrade(newGrade);
				break;
			}
		}
	}

	/* serching the student in the ArrayList */
	public StudentDTO searchStudent(String sname) {
		
		for(StudentDTO student : studentlist) {
			if(student.getSname().equalsIgnoreCase(sname))
				return student;
		}
		return null;
	}
	
	/* to delete the student details from the ArrayList */
	public void deleteStudentReords(int sno) {
		studentlist.removeIf(student -> student.getSno() == sno);
	}
}