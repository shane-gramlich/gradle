package com.codingbat;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice.ErrorMessages;
import practice.TestGroups;

public class Array1Test {
	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void firstLast6() {

		int[] array = { 1, 2, 6 };
		boolean classOutput = new Array1().firstLast6(array);
		Assert.assertEquals(classOutput, true, ErrorMessages.Assert.getMessage());

		array = new int[] { 6, 1, 2, 3 };
		classOutput = new Array1().firstLast6(array);
		Assert.assertEquals(classOutput, true, ErrorMessages.Assert.getMessage());

		array = new int[] { 13, 6, 1, 2, 3 };
		classOutput = new Array1().firstLast6(array);
		Assert.assertEquals(classOutput, false, ErrorMessages.Assert.getMessage());
	}

	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void reverse3() {
		Integer[] array = { 1, 2, 3 };
		Integer[] classOutput = new Array1().reverse3(array);
		Integer[] testOutput = { 3, 2, 1 };
		Assert.assertTrue(Arrays.equals(classOutput, testOutput));
	}

}
