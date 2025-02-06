package com.java.IOStream;

import java.io.Serializable;

public class StudentData implements Serializable{
	
	private static final long serialVersionUID=1L;
	private int sno;
	private String sname;
	private String course;
	private double fee;
	private transient String email;
	private transient long mobile;
	private char gender;
	private boolean studying;
	
	public StudentData() {
		
	}
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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	} 

	public boolean isStudying() {
		return studying;
	}

	public void setStudying(boolean studying) {
		this.studying = studying;
	}
	
	@Override
	public String toString() {
		return "Sno\t	:: "+sno+"\n"+
			   "Snamw \t	:: "+sname+"\n"+
			   "Course\t 	:: "+course+"\n"+
			   "Fee\t 	:: "+fee+"\n"+
			   "Email\t 	:: "+email+"\n"+
			   "Mobile\t 	:: "+mobile+"\n"+
			   "Gender\t 	:: "+gender+"\n"+
			   "Studying\t :: "+studying;
	}
}
