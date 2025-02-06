package com.ankit.java.streamai.interview;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int yearOfJoin;
	private double salary;
	private String department;

	public Employee(int id, String name, int age, String gender, int yearOfJoin, double salary, String department) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.yearOfJoin = yearOfJoin;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYearOfJoin() {
		return yearOfJoin;
	}

	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", yearOfJoin="
				+ yearOfJoin + ", salary=" + salary + ", department=" + department + "]";
	}

}
