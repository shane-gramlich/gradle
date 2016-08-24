package com.codingbat;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice.ErrorMessages;
import practice.TestGroups;

public class Recursion1Test {
	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void factorial() {
		Assert.assertEquals(Recursion1.factorial(4), 24, ErrorMessages.Assert.getMessage());
	}

	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void bunnyEars2() {
		Assert.assertEquals(Recursion1.bunnyEars2(10), 25, ErrorMessages.Assert.getMessage());
	}
}
