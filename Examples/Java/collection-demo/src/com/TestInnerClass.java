package com;

class Outer {
	private class Inner {
		void display() {
			System.out.println("display() is inside the Inner");
		}
	}
	
	public void createInnerInstance() {
		Inner inner = new Inner();
		inner.display();
	}
}

public class TestInnerClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.createInnerInstance();
		
		// inner class inside main method
	 class Xyz { 
			void displayXyz() {
				System.out.println("displayXyz() is inside main method");
			}
		}
	}
}
