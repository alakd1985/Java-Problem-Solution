package javaPracticeProblem;

import java.util.Scanner;

public class OccuranceOfTwoStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line :: ");
		String word = scanner.nextLine().toLowerCase();
		System.out.println("Please enter a character/word to search:: ");
		String seachword = scanner.nextLine();
		int x = seachword.length();
		int xSearchword = 0;
		System.out.println("Please enter another character/word to search:: ");
		String seachword1 = scanner.nextLine();
		int y = seachword1.length();
		int ySeacrchword = 0;

		for (int i = 0; i < word.length(); i++) {
			if (i + x <= word.length() && word.substring(i, i + x).equals(seachword)) {
				xSearchword++;
			}
			if (i + y <= word.length() && word.substring(i, i + y).equals(seachword1)) {
				ySeacrchword++;
			}
		}
		System.out.println(xSearchword == ySeacrchword);

	}
}
