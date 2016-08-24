package com.codingbat;

public class HelloName {
	private String name;

	public HelloName(String name) {
		this.name = name;
	}

	String greet() {
		return "Hello " + name + "!";
	}
}
