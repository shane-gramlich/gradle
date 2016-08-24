package com.codingbat;

public class Recursion1 {
	/**
	 * Given n of 1 or more, return the factorial of n, which is n * (n-1) *
	 * (n-2) ... 1. Compute the result recursively (without loops).
	 */
	public static int factorial(int n) {
		if ((n - 1) >= 2) {
			return n * (factorial(n - 1));
		}
		return n;
	}

	/**
	 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
	 * (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
	 * have 3 ears, because they each have a raised foot. Recursively return the
	 * number of "ears" in the bunny line 1, 2, ... n (without loops or
	 * multiplication).
	 */
	public static int bunnyEars2(int bunnies) {
		if (bunnies >= 1) {
			if ((bunnies % 2) == 0) {
				return 3 + bunnyEars2(bunnies - 1);
			} else {
				return 2 + bunnyEars2(bunnies - 1);
			}
		}
		return bunnies;
	}
}
