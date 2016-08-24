package com.codingbat;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice.ErrorMessages;
import practice.TestGroups;

public class String1Test {
	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void testHelloName() {
		String classOutput = new String1().helloName("James Gosling");
		Assert.assertEquals(classOutput, "Hello James Gosling!", ErrorMessages.Assert.getMessage());
	}

	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void testMakeOutWord() {
		String classOutput = new String1().makeOutWord("<<>>", "word");
		Assert.assertEquals(classOutput, "<<word>>", ErrorMessages.Assert.getMessage());
	}
}
