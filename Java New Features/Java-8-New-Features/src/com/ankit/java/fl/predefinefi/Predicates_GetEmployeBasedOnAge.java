package com.ankit.java.fl.predefinefi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		System.out.println("Employee::0-param constructor");
		this.name = name;
		this.age = age;
	}

}

public class Predicates_GetEmployeBasedOnAge {
	public static void main(String[] args) {
		System.out.println("GetEmployeBasedOnAge.main()::main started");
		
		// initialize the Employee with specific value
		Employee e1 = new Employee("Ankit", 19);
		Employee e2 = new Employee("Arnav", 20);
		Employee e3 = new Employee("Sonu", 10);
		Employee e4 = new Employee("Garima", 18);

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> employeeAge = e -> e.age >= 18;

		for (Employee employee : employees) {
			if (employeeAge.test(employee)) {
				System.out.println(employee.name);
			}
		}
		System.out.println("GetEmployeBasedOnAge.main()::main ended");
	}
}
