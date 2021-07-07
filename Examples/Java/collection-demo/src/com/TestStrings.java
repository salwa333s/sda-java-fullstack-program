package com;

public class TestStrings {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1.toUpperCase();
		String s3 = s2.concat("1234");
		System.out.println(s2); // HELLO
		System.out.println(s1); // hello
		System.out.println(s3); // HELLO1234
		
		StringBuffer sb1 = new StringBuffer("welcome");
		System.out.println(sb1); // welcome
		sb1.append(12345);
		System.out.println(sb1); // welcome12345
	}
}
