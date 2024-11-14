package com.employee;

import java.util.Arrays;

public class EmployeeSorter {
	 public static void sortEmployeesBySalary(Employee[] employees) {
	        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
	    }

	    public static void main(String[] args) {
	        Employee[] employees = {
	            new Employee("Geeta", 80000),
	            new Employee("Priya", 75000),
	            new Employee("Devyani", 60000),
	            new Employee("Dipali", 45000)
	        };

	        System.out.println("Employees before sorting:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }

	        sortEmployeesBySalary(employees);

	        System.out.println("\nEmployees after sorting by salary:");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }


}
