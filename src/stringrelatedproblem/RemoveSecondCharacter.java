package stringrelatedproblem;

import java.util.Scanner;

public class RemoveSecondCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write a word:: ");
		String s = scanner.next().toLowerCase();
		System.out.println("Please pick a letter:: ");
		String s1 = scanner.next();
		char x = s1.charAt(0);
		System.out.println("Please pick a second letter:: ");
		String s2 = scanner.next();
		char y = s2.charAt(0);
		System.out.println(remSecondString(s, x, y));
	}

	public static String remSecondString(String s, char c, char c1) {
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.charAt(i) == c && s.charAt(i + 2) == c1)
				s = s.substring(0, i + 1) + s.substring(i + 2);
		}
		return s;
	}
}
