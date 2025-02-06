package com.ankit.java.streamapi.map;

import java.util.Arrays;
import java.util.List;

public class GetEmpBasedOnSalary {
	public static void main(String[] args) {
		System.out.println("getEmpBassedOnSalary.main()::main started");
		
		Employee emp1 = new Employee(101, "John", 12000);
		Employee emp2 = new Employee(102, "David", 3000000);
		Employee emp3 = new Employee(103, "Head", 200000);
		Employee emp4 = new Employee(104, "Rose", 10000);
		Employee emp5 = new Employee(105, "Helly", 500000);
		Employee emp6 = new Employee(106, "Tom", 23000);

		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);

		empList.stream().filter(emp -> emp.empSalary >= 500000)
				.map(emp -> emp.empName + "--" + emp.empId)
				.forEach(emp -> System.out.println(emp));
		
		System.out.println("getEmpBassedOnSalary.main()::main ended");
	}
}

class Employee {
	int empId;
	String empName;
	double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}