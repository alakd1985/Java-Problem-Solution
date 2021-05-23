package stringrelatedproblem;

import java.util.Scanner;

public class TriplesCounting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word:: ");
		String v = scanner.nextLine();
		System.out.println("The total number of triples in the word is:: " + noOfTriples(v));
	}

	public static int noOfTriples(String word) {
		int count = 0;
		for (int i = 1; i < word.length() - 1; i++) {
			char ch = word.charAt(i);
			if (word.charAt(i - 1) == ch && word.charAt(i + 1) == ch) {
				count++;
			}
		}
		return count;
	}
}
