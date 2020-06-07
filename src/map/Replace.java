package map;

import java.util.HashMap;
import java.util.Map;

public class Replace {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(2, "om");
		hashMap.put(1, "lucky");
		hashMap.put(3, "dutta");
		hashMap.put(4, "toma");

		System.out.println("Before replace any elements::");

		for (Map.Entry x : hashMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());

		}

		// replacing one element

		hashMap.replace(1, "rakesh");
		System.out.println("After replacing one element::");

		for (Map.Entry x : hashMap.entrySet()) {

			System.out.println(x.getKey() + " " + x.getValue());

		}

		// replace two values in one key

		hashMap.replace(2, "krishna", "Lord");
		System.out.println("After replacing one value with two to single key::");

		for (Map.Entry x : hashMap.entrySet()) {

			System.out.println(x.getKey() + " " + x.getValue());

		}

		// replacing all with single value

		hashMap.replaceAll((k, v) -> "alak");

		System.out.println("After replacing all the value with a single one");

		for (Map.Entry v : hashMap.entrySet()) {

			System.out.println(v.getKey() + " " + v.getValue());
		}

	}

}
