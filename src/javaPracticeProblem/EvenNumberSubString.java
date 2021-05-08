package javaPracticeProblem;

import java.util.Scanner;

public class EvenNumberSubString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line:: ");
		String line = scanner.nextLine();
		System.out.println("After adding the even number character:: " + evenSubstring(line));

	}

	public static String evenSubstring(String s) {
		String newLine = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (i % 2 == 0) {
				newLine += s.charAt(i);
			}
		}
		return newLine;
	}
}
