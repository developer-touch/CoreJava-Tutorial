package com.ankit.opp;

public class Faculty extends Person{
	
	private static String institute;
	
	private int fno;
	private String dept;
	private double sal;
	
	static {
		institute = "NIT";
	}
	
	public Faculty(String name,double height,double weight,
			int fno,String dept,double sal){
		super(name,height,weight);
		
		this.fno = fno;
		this.dept = dept;
		this.sal = sal;
	}
	
	public static void setIntitute(String intitute) {
		Faculty.institute = institute;
	}
	public static String getInstitute() {
		return institute;
	}
	
	public void setFno(int fno) {
		this.fno = fno;
	}
	public int getFno() {
		return fno;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	public void getSal(double sal) {
		this.sal = sal;
	}
	
	public void teach() {
		System.out.println(getName()+" is teaches"+dept);
	}
	
	public void scold() {
		System.out.println(getName()+" is scolding to"+dept+" students");
	}
	
	public void conExam() {
		System.out.println(getName()+"is conducting "+dept+" exam");
	}
	
	public String toString() {
		return super.toString()+"\n"+
				"Faculty Details :: "+
					"Fno\t :: "+fno+"\n"+
					"Dept\t :: "+dept+"\n"+
					"Sal\t :: "+sal;
	}
}
