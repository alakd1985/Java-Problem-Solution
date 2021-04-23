package javaPracticeProblem;

import java.util.Scanner;

public class FinddigitLetter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String line = scanner.nextLine();
		char[] c = line.toCharArray();
		int letter = 0;
		int emptyspaces = 0;
		int digit = 0;
		int others = 0;
		for (Character cc : c) {
			if (Character.isDigit(cc)) {
				digit++;
			} else if (Character.isLetter(cc)) {
				letter++;
			} else if (Character.isSpaceChar(cc)) {
				emptyspaces++;
			} else {
				others++;
			}
		}

		System.out.println("The numebr of digits are: " + digit);
		System.out.println("The numebr of letters are: " + letter);
		System.out.println("The numebr of spaces are: " + emptyspaces);
		System.out.println("The numebr of others are: " + others);

	}

}
