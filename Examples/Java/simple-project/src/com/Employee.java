package com;

public class Employee extends Person {
	int id;
	double salary;
	void updateSalary() {
		System.out.println("updateSalary() inside Employee");
	}
}
