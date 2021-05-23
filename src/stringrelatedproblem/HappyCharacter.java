package stringrelatedproblem;

import java.util.Scanner;

public class HappyCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write a word:: ");
		String s = scanner.next().toLowerCase();
		System.out.println("Please pick a letter:: ");

		String s1 = scanner.next();
		char c = s1.charAt(0);
		System.out.println(isHappy(s, c));
	}

	public static boolean isHappy(String str, char ch) {
		boolean flag = false;
		int len = str.length();

		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ch) {
				if (i > 0 && str.charAt(i - 1) == ch) {
					flag = true;
				} else if (i + 1 < len && str.charAt(i + 1) == ch) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}

		return flag;

	}
}
