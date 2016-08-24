package com.codingbat;

public class Array1 {
	/**
	 * Given an array of ints, return true if 6 appears as either the first or
	 * last element in the array. The array will be length 1 or more.
	 */
	public boolean firstLast6(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}

		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	/**
	 * Given an array of ints length 3, return a new array with the elements in
	 * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	 */
	Integer[] reverse3(Integer[] nums) {
		Integer[] nums2 = new Integer[nums.length];
		int counter = 1;
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[nums.length - counter];
			counter++;
		}
		return nums2;
	}
}
