package ArrayExercise;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Computer Science");
		aList.add("Biochemistry");

		String[] liSt = new String[aList.size()];
		aList.toArray(liSt);

		for (String s : liSt) {
			System.out.println(s);
		}
	}
}
