package map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// create hash map

		HashMap hashMap = new HashMap();
		hashMap.put(1, "alak");
		hashMap.put(2, "toma");
		// print out the hash map

		System.out.println(hashMap);
		// removing all the elements from hashmap
		hashMap.clear();
		System.out.println(hashMap);

	}

}
