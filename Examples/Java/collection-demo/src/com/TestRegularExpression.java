package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String[] args) {
		// to find only alphabets in lowercase
		Pattern pattern = Pattern.compile("[a-z]");
		// to find uppercase & lowercase letters
		//pattern = Pattern.compile("[A-Za-z]");
		// pattern that matches hello
		//pattern = Pattern.compile("(hello)");
		// pattern that matches hello which is repeating minimum 2 times max 3 times
		pattern = Pattern.compile("(hello){2,3}");
		Matcher matcher = pattern.matcher("Hello Pa$$w0rd hello everyone hellohello everybody hellohellohello welcome");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}
}
