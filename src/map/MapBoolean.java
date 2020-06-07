package map;

import java.util.HashMap;

public class MapBoolean {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put(1, "toma");
		hashMap.put(2, "alak");
		System.out.println(hashMap);

		// check existence of key 2

		System.out.println("Check if key 2 exists::" + hashMap.containsKey(2));
		
		// check existence of key 2
		
		System.out.println("Check if value 2 exists::"+hashMap.containsValue("toma"));

	}

}
