package com.ankit.java.fl.predefinefi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Faculty {
	int facultyId;
	String facultyName;
	String course;

	public Faculty(int facultyId, String facultyName, String course) {
		System.out.println("Faculty::0-param constructor");
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.course = course;
	}
}

public class Predicates_GetFacultyDetailBasedOnCourse {
	public static void main(String[] args) {
		System.out.println("GetFacultyDetailBasedOnCourse.main()::main started");

		// initialize and create object of Faculty with specific value
		Faculty faculty1 = new Faculty(101, "Hari", "Java");
		Faculty faculty2 = new Faculty(102, "Ashok", "Java");
		Faculty faculty3 = new Faculty(103, "Venkatesh", "AdvJava");
		Faculty faculty4 = new Faculty(104, "Ashok", "AdvJava");
		Faculty faculty5 = new Faculty(105, "Natraj", "SBMS");
		Faculty faculty6 = new Faculty(106, "Ashok", "SBMS");
		Faculty faculty7 = new Faculty(107, "Dilip", "SFW");

		// add to the list
		List<Faculty> faculties = Arrays.asList(faculty1, faculty2, faculty3, faculty4, faculty5, faculty6,faculty7);

		// create lambda exression to check faculty credential
		Predicate<Faculty> faculty = f -> f.course.equals("Java");

		// validate the faculty and display
		for (Faculty fcty : faculties) {
			if (faculty.test(fcty)) {
				System.out.println(fcty.facultyId + "\t" + fcty.facultyName);
			}
		}
		System.out.println("GetFacultyDetailBasedOnCourse.main()::main ended");
	}
}
