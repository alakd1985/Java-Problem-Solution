package map;

import java.util.HashMap;

public class HashmapClone {

	public static void main(String[] args) {
		
		HashMap hashMap=new HashMap();
		HashMap hashMap1=new HashMap();
		
		hashMap.put(1, "toma");
		hashMap.put(2, "alak");
		hashMap.put(3, "alak1");
		hashMap.put(4, "alak2");
		System.out.println(hashMap);
		
		hashMap1= (HashMap)hashMap.clone();
		System.out.println(hashMap1);
		
		
		//key-based removal  
	    hashMap.remove(1);  
	    System.out.println("Updated list of elements: "+hashMap);  
	    
	    //value-based removal  
	    hashMap.remove("alak");  
	    System.out.println("Updated list of elements: "+hashMap);  
	    
	    //key-value pair based removal  
	    hashMap.remove(4, "alak2");  
	    System.out.println("Updated list of elements: "+hashMap);  
		
	}

}
