package com.java.StudentManagement;

public class StudentDTO {
	
	//creating private reference variable provide encapsulation
	private int sno;
	private String sname;
	private String course;
	private String grade;
	
	//to initialize reference variable during object created
	public StudentDTO(int sno,String sname,String course,String grade){
		this.sno    = sno;
		this.sname  = sname;
		this.course = course;
		this.grade = grade;
	}
	
	//setter and getter method to set and get this private method in another class
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public int getSno() {
		return sno;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
	//override to String method to print all student details
	public String toString() {
		return  "Sno    :: " + sno   +" "+
				"SName  :: " + sname +" "+ 
				"Course  :: " + course +" "+ 
				"Grade :: " + grade;
	}
}
