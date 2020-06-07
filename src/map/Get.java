package map;

import java.util.HashMap;

public class Get {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put(1, "toma");
		hashMap.put(2, "alak");
		System.out.println(hashMap);

		// get the value from the hashmap
		System.out.println("Get the value::" + hashMap.get(2));
		String value = (String) hashMap.get(2);
		System.out.println("The value is::" + value);

	}

}
