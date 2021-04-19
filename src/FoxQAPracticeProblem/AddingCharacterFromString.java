package FoxQAPracticeProblem;

import java.util.Scanner;

public class AddingCharacterFromString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String word = scanner.nextLine();
		int len = word.length();
		System.out.println("Enter the number of letters want to join: ");
		String joinLetter = scanner.next();
		if (joinLetter.length() > len) {
			System.out.println("The strings are greter than the word");

		} else {
			String subpart = word.substring(len - 3);
			System.out.println(subpart + word + subpart);
		}
	}
}
