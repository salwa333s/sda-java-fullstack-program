package com;

public class TestEncapsulation {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Alex", 35200);
		Employee e2 = new Employee(200, "Bruce", 20000);
		
		
		System.out.println("Id = "+e1.getId()+", Name = "+e1.getName()+", Salary = "+e1.getSalary());
		System.out.println("Id = "+e2.getId()+", Name = "+e2.getName()+", Salary = "+e2.getSalary());
		System.out.println("----------------------------------------");
		e1.setName("Alexandar");
		e2.setName("Brook");
		System.out.println("Id = "+e1.getId()+", Name = "+e1.getName()+", Salary = "+e1.getSalary());
		System.out.println("Id = "+e2.getId()+", Name = "+e2.getName()+", Salary = "+e2.getSalary());
	}
}
