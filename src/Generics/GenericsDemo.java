package Generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		
		Container<String> constring= new Store<>(); 
		constring.set("Java");
		System.out.println(constring.get());
		
		
		Container<Integer> conInt= new Store<>(); 
		conInt.set(10);
		System.out.println(conInt.get());
		
		Container<List<Integer>> ListInt= new Store<>(); 
		ListInt.set(Arrays.asList(1,2,3));
		System.out.println(ListInt.get());
		
		List<Number> list= new ArrayList<Number>();
		list.add(new Integer(23));
		list.add(new Double(234));
		
		
		
	
	
	
}
}