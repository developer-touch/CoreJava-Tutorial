package com.java.OPPConcept;

public class Student {
	private int 	sno;
	private String 	sname;
	private String 	course;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display() {
		System.out.println("Sno\t\t :: "   + sno);
		System.out.println("Sname\t\t :: " + sname);
		System.out.println("Course\t\t :: "+ course);
	}
}
