package com;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(20);
		set.add(20);
		set.add(10);
		set.add(50);
		set.add(60);
		System.out.println(set);
		
		Employee e1 = new Employee(1, "Alex", 35000);
		Employee e2 = new Employee(2, "Bruce", 42000);
		Employee e3 = new Employee(3, "Charles", 70000);
		
		Set<Employee> setEmployee = new HashSet<Employee>();
		setEmployee.add(e1);
		setEmployee.add(e1);
		setEmployee.add(e1);
		setEmployee.add(e1);
		System.out.println("Size: "+setEmployee.size());
		System.out.println(setEmployee);
		
	}
}
