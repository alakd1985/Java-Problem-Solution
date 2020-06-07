package map;

import java.util.HashMap;
import java.util.Set;

public class SetView {

	public static void main(String[] args) {
		// create hash map
	      HashMap newmap = new HashMap();

	      // populate hash map
	      newmap.put(1, "tutorials");
	      newmap.put(2, "point");
	      newmap.put(3, "is best");
	      
	      System.out.println("Dictionary view of Hashmap::"+newmap);
	      // creating set view
	      
	      Set set= newmap.entrySet();
	      System.out.println("Set view of Hashmap::"+set);

	}

}
