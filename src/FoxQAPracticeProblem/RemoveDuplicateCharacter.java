package FoxQAPracticeProblem;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String string = "coconut";
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < string.length(); i++) {
			set.add(string.charAt(i));
		}
		StringBuffer sBuffer = new StringBuffer();
		for (Character c : set) {
			sBuffer.append(c);
		}
		System.out.println("After removing the duplicate:: " + sBuffer);
	}
}
