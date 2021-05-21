package stringRelatedProblem;

import java.util.Scanner;

public class RevEachWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a single line:::   ");
		String str = scanner.nextLine();
		String[] words = str.split(" ");

		String reversedStr = "";

		for (String word : words) {

			String reversedWord = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				reversedWord = reversedWord + word.charAt(i);

			}

			reversedStr = reversedStr + reversedWord + " ";

		}

		System.out.println(reversedStr);

	}
}
