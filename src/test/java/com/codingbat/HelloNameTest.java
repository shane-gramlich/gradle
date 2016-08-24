package com.codingbat;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice.ErrorMessages;
import practice.TestGroups;

public class HelloNameTest {
	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void testHelloName() {
		String name = getRandomName();
		String classOutput = new HelloName(name).greet();
		String testOutput = getTestOutput(name);
		Assert.assertEquals(classOutput, testOutput, ErrorMessages.Assert.getMessage());
	}

	private String getRandomName() {
		String[] names = { "Ada Lovelace", "James Gosling", "Dennis Ritchie" };
		int randomIndex = new Random().nextInt(names.length);
		return names[randomIndex];
	}

	private String getTestOutput(String name) {
		return "Hello " + name + "!";
	}
}
