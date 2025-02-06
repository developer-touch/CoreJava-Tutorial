package com.ankit.java.streamapi.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStudentBasedOnCountry {
	public static void main(String[] args) {
		System.out.println("GroupStudentBasedOnCountry.main()::main started");
		Student s1 = new Student(1, "Ankit", "IND");
		Student s2 = new Student(2, "Rose", "AUS");
		Student s3 = new Student(3, "David", "SA");
		Student s4 = new Student(4, "Smith", "WI");
		Student s5 = new Student(5, "Babar", "PAK");
		Student s6 = new Student(6, "Root", "ENG");

		List<Student> studentList = Arrays.asList(s1, s2, s3, s4, s5, s6);
		Map<String, List<Student>> data = studentList.stream().collect(Collectors.groupingBy(s -> s.country));
		System.out.println(data);
		Map<String, List<Student>> studentData =  studentList.stream().collect(Collectors.groupingBy(s->s.name));
		System.out.println(studentData);
		System.out.println("GroupStudentBasedOnCountry.main()::main ended");
	}
}

class Student {
	int id;
	String name;
	String country;

	public Student(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}