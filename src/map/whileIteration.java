package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class whileIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		hashMap.put(2, "om");
		hashMap.put(1, "lucky");
		hashMap.put(3, "dutta");
		hashMap.put(4, "toma");

		Collection c = hashMap.values();
		Iterator iterator = c.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}

}
