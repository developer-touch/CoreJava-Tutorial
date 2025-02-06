package com.ankit.java.streamai.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question04HighestPaidEmployeeInDepartment {
	public static void main(String[] args) {
		System.out.println("Question04HighestPaidEmployeeInDepartment.main()::main started");
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "John", 32, "Male", 2011, 25000.0, "HR"));
		employeeList.add(new Employee(2, "Smith", 25, "Male", 2015, 13500.0, "Sales"));
		employeeList.add(new Employee(3, "David", 29, "Male", 2012, 18000.0, "Infrasturcture"));
		employeeList.add(new Employee(4, "Orlen", 28, "Male", 2014, 35000.0, "Development"));
		employeeList.add(new Employee(5, "Charles", 27, "Male", 2013, 22700.0, "HR"));
		employeeList.add(new Employee(6, "Cathy", 43, "Female", 2012, 10500.0, "Security"));
		employeeList.add(new Employee(7, "Ramesh", 35, "Male", 12016, 27000.0, "Finance"));
		employeeList.add(new Employee(8, "Suresh", 32, "Male", 2018, 80000.0, "Developmnet"));
		employeeList.add(new Employee(9, "Gita", 24, "Female", 2015, 34000.0, "Sales"));
		employeeList.add(new Employee(10, "Mahesh", 27, "Male", 2017, 40000.0, "Security"));
		employeeList.add(new Employee(11, "Gouri", 26, "Female", 2014, 15700.0, "Infrasturcture"));
		employeeList.add(new Employee(12, "Nitin", 24, "Male", 2013, 28400.0, "Developmnet"));
		employeeList.add(new Employee(13, "Swati", 26, "Female", 2010, 34500.0, "Sales"));
		employeeList.add(new Employee(14, "Ashok", 23, "Male", 2018, 12700.0, "Infrasturcture"));
		employeeList.add(new Employee(15, "Buttler", 29, "Male", 2011, 32300.0, "Sales"));
		employeeList.add(new Employee(16, "Sanvi", 20, "Female", 2019, 39100.0, "Security"));

		/**
		 * 	4. Get the details of highest paid employee in the department
		 */
		Optional<Employee> emp =  employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		if (emp.isPresent()) {
			System.out.println(emp);
		}
		System.out.println("Question04HighestPaidEmployeeInDepartment.main()::main ended");
	}
}