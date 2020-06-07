package map;

import java.util.HashMap;
import java.util.Map;

public class AddNewValue {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(2, "om");
		hashMap.put(1, "lucky");
		hashMap.put(2, "alak");// duplicate value
		hashMap.put(3, "dutta");
		hashMap.put(4, "toma");

		// to see if the value is present or not

		hashMap.putIfAbsent(5, "rakesh");

		// iteration to print out the value
		for (Map.Entry x : hashMap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

		// cloning of map

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.putAll(hashMap);

		// iteration of the new map
		System.out.println("After cloning to the new map");
		for (Map.Entry x : map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

	}

}
