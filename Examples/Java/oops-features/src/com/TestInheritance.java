package com;

class A {
	A() {
		System.out.println("A() constructor");
	}
}
class B extends A {
	B() {
		System.out.println("B() constructor");
	}
}
class C extends B {
	C() {
		System.out.println("C() constructor");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("-----------------");
		B b1 = new B();
		System.out.println("-----------------");
	}
}
