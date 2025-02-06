package com.ankit.java.streamapi.collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetMaxMinAndAvgSalaryUsingCollect {
	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails(1, "Ankit", 12000.00);
		EmployeeDetails e2 = new EmployeeDetails(2, "Rose", 12500.00);
		EmployeeDetails e3 = new EmployeeDetails(3, "Ching", 13400.00);
		EmployeeDetails e4 = new EmployeeDetails(4, "David", 30200.00);
		EmployeeDetails e5 = new EmployeeDetails(5, "Tom", 450000.00);
		EmployeeDetails e6 = new EmployeeDetails(6, "Rhull", 20300.00);

		List<EmployeeDetails> employeeList = Arrays.asList(e1, e2, e3, e4, e5, e6);
		Optional<EmployeeDetails> max = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("MAX SALARY =>"+max);
		System.out.println();
		
		Optional<EmployeeDetails> min= employeeList.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("MIN SALARY=> "+min);
		
		Double average = employeeList.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("AVG SALARY=> "+average);
	}
}

class EmployeeDetails {
	int id;
	String name;
	double salary;

	public EmployeeDetails(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}