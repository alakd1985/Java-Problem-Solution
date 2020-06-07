package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		
		hashMap.put(2, "om");
		hashMap.put(1, "lucky");
		hashMap.put(2, "alak");//duplicate value 
		hashMap.put(3, "dutta");
		hashMap.put(4, "toma");
	
		// Iteration to get the value and the key
		
		for (Map.Entry s : hashMap.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

}
