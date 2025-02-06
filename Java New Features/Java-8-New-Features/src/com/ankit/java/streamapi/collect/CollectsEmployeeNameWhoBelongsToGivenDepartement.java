package com.ankit.java.streamapi.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectsEmployeeNameWhoBelongsToGivenDepartement {

	public static void main(String[] args) {
		System.out.println("CollectsEmployeeNameAndEmailWhoBelongsToGivenDepartement.main()::main started");
		Employee e1 = new Employee("John", "Manager", "john123@gmail.com");
		Employee e2 = new Employee("Rose", "Marketing", "rose123@gmail.com");
		Employee e3 = new Employee("David", "Accounting", "david123@gmail.com");
		Employee e4 = new Employee("Steve", "Personnel", "steve123@gmail.com");
		Employee e5 = new Employee("Miller", "Manager", "miller123@gmail.com");
		Employee e6 = new Employee("Tom", "Marketing", "tom123@gmail.com");
		Employee e7 = new Employee("Alex", "Manager", "alex123@gmail.com");
		List<Employee> employeeList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
		List<String> employeeName = employeeList.stream().filter(e -> e.dept.equalsIgnoreCase("manager"))
				.map(e -> e.name).collect(Collectors.toList());
		employeeName.forEach(e -> System.out.println(e));
		System.out.println("CollectsEmployeeNameAndEmailWhoBelongsToGivenDepartement.main()::main ended");
	}
}

class Employee {
	String name;
	String dept;
	String email;

	public Employee(String name, String dept, String email) {
		this.name = name;
		this.dept = dept;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", email=" + email + "]";
	}

}