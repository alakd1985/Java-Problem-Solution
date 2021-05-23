package stringrelatedproblem;

import java.util.Scanner;

public class SpecialCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word containing special character:: ");
		String word = scanner.next();
		System.out.println(leftRightfound(word));
	}

	public static boolean leftRightfound(String s) {
		int l = s.length();
		boolean found = true;
		for (int i = 0; i < l; i++) {
			String tmpString = s.substring(i, i + 1);
			if (tmpString.equals("#") && i > 0 && i < l - 1) {
				if (s.charAt(i - 1) == s.charAt(i + 1))
					found = true;
				else
					found = false;
			}
		}
		return found;
	}
}
