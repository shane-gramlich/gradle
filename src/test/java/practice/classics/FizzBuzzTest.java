package practice.classics;

import org.testng.Assert;
import org.testng.annotations.Test;

import practice.ErrorMessages;
import practice.TestGroups;

public class FizzBuzzTest {
	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void fizzString() {
		Assert.assertEquals(FizzBuzz.fizzString("fib"), "FizzBuzz", ErrorMessages.Assert.getMessage());
		Assert.assertEquals(FizzBuzz.fizzString("booo"), "booo", ErrorMessages.Assert.getMessage());
		Assert.assertEquals(FizzBuzz.fizzString("fig"), "Fizz", ErrorMessages.Assert.getMessage());
		Assert.assertEquals(FizzBuzz.fizzString("dib"), "Buzz", ErrorMessages.Assert.getMessage());
	}

	@Test(enabled = true, groups = { TestGroups.All, TestGroups.CodingBat })
	void fizzString2() {
		Assert.assertEquals(FizzBuzz.fizzString2(15), "FizzBuzz!", ErrorMessages.Assert.getMessage());
		Assert.assertEquals(FizzBuzz.fizzString2(1), "1!", ErrorMessages.Assert.getMessage());
		Assert.assertEquals(FizzBuzz.fizzString2(3), "Fizz!", ErrorMessages.Assert.getMessage());
		Assert.assertEquals(FizzBuzz.fizzString2(5), "Buzz!", ErrorMessages.Assert.getMessage());
	}
}
