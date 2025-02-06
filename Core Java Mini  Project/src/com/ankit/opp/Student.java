package com.ankit.opp;

public class Student extends Person {
	
	private static String institute;
	
	private int sno;
	private String course;
	private double fee;

	static {
		institute = "NIT";
	}
	
	public Student(String name, double height, double weight,
			int sno,String course,double fee) {
		super(name, height, weight);//Calling super class constructor
									//for initialize properties of Super class
		
		this.sno = sno;				//initialize properties in sub class 
		this.course= course;
		this.fee = fee;
	}
	
	public static void setInstitute(String institute) {
		Student.institute = institute;
	}
	
	public static String getInstitute() {
		return institute;
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getSno() {
		return sno;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	public void sleep() {
		System.out.println(getName()+" is sleeping");
	}
	
	public void write() {
		System.out.println(getName()+" is writing "+course+" notes.");
	}
	
	public void read() { 
		System.out.println(getName()+" is reading "+course+" notes.");
	}
	
	public void reply() {
		System.out.println(getName()+" is replying "+course+" questions");
	}
	
	public String toString() {
		return super.toString()+"\n"+
				"Student Details :: "+
				"Sno\t :: "+sno+"\n"+
				"Course\t :: "+course+"\n"+
				"Fee\t :: "+fee;
	}
}
