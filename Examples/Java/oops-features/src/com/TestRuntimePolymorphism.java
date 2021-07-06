package com;

class X {
	void display() { 
		System.out.println("display() in X");
	}
}
class Y extends X {
	void display() {
		System.out.println("display() in Y");
	}
}
class Z extends Y {
	void display() {
		System.out.println("display() in Z");
	}
}
public class TestRuntimePolymorphism {
	public static void main(String[] args) {
		X x = new X();   Y y = new Y();   Z z = new Z();
		X x1;
		x1 = x;		x1.display();
		System.out.println("-------------------");
		x1 = y;		x1.display();
		System.out.println("-----------------------");
		x1 = z;		x1.display();
	}
}
