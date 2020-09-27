package Generics;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		
		ArrayList aList = new ArrayList();
		aList.add(10);
		aList.add(12.34);
		aList.add("Alak");
		
		double var = (double)aList.get(1);
		System.out.println(var);

	}
}
