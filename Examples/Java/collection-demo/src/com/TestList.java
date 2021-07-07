package com;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		// a list which will have strings
		List<String> listStrings = new ArrayList<String>();
		// a list which will have employees
		List<Employee> listEmployees = new ArrayList<Employee>();
		
		listStrings.add("hello");
		listStrings.add("demo");
		listStrings.add("hello");
		listStrings.add("welcome");
		for(String s : listStrings) {
			System.out.println(s);
		}
		Employee e1 = new Employee(1, "Alex", 35000);
		Employee e2 = new Employee(2, "Bruce", 42000);
		
		listEmployees.add(e1);
		listEmployees.add(e2);
		listEmployees.add(e2);
		for(Employee e : listEmployees) {
			System.out.println("id = "+e.getId()+", name = "+e.getName()+", salary = "+e.getSalary());
		}
	}
}
