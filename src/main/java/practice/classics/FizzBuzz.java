package practice.classics;

/**
 * Used at Vivint for Android App Development position Aug 2016
 */
public class FizzBuzz {
	/**
	 * Given a string str, if the string starts with "f" return "Fizz". If the
	 * string ends with "b" return "Buzz". If both the "f" and "b" conditions
	 * are true, return "FizzBuzz". In all other cases, return the string
	 * unchanged.
	 */
	public static String fizzString(String string) {
		if (string.startsWith("f") && string.endsWith("b")) {
			return "FizzBuzz";
		}
		if (string.startsWith("f")) {
			return "Fizz";
		}
		if (string.endsWith("b")) {
			return "Buzz";
		}
		return string;
	}

	/**
	 * Given an int n, return the string form of the number followed by "!". So
	 * the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz"
	 * instead of the number, and if the number is divisible by 5 use "Buzz",
	 * and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod"
	 * operator computes the remainder after division, so 23 % 10 yields 3. What
	 * will the remainder be when one number divides evenly into another?
	 */
	public static String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz!";
		}
		if (n % 3 == 0) {
			return "Fizz!";
		}
		if (n % 5 == 0) {
			return "Buzz!";
		}
		return n + "!";
	}
}
