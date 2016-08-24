package practice.sandbox;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Streams {

	public static void main(String[] args) {
		hashtableToStream();
		arrayListToStream();
		arrayToIntStream();
	}

	private static void hashtableToStream() {
		Hashtable<Object, Double> hashtable = new Hashtable<Object, Double>();
		hashtable.put("Shane", new Double(3434.34));
		hashtable.put("Michelle", new Double(123.22));
		hashtable.put("Meki", new Double(1378.00));
		hashtable.put("Manaia", new Double(99.22));
		hashtable.put("Puppy", new Double(-19.08));

		Set<Object> keys = hashtable.keySet();
		keys.stream().forEach(key -> System.out.println(key + " " + hashtable.get(key)));
		keys.stream().filter(key -> key.equals("Shane")).forEach(n -> {
			hashtable.put(n, (double) hashtable.get(n) + 1000);
			System.out.println(n + "'s hashtable value was changed to " + hashtable.get(n));
		});
	}

	private static void arrayListToStream() {
		List<String> list = Arrays.asList("Hello", "World!", "How", "Are", "You");
		list.stream().forEach(System.out::println);
	}

	private static void arrayToIntStream() {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(n -> System.out.println(n));
	}

}
