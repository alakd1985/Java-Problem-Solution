package stringrelatedproblem;

import java.util.Scanner;

public class CharacterRepetition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a string :: ");
		String word = scanner.nextLine();
		System.out.println("How many characters from the end want to repeat? ");
		int numOfCharacters = scanner.nextInt();
		System.out.println("How many times want to repeat it? ");
		int numOfTimes = scanner.nextInt();
		int len = word.length();
		int start = len - numOfCharacters;
		String newString = "";
		for (int i = 0; i < numOfTimes; i++) {
			newString = newString + word.substring(start, len);
		}
		System.out.println("The new String after the repetition is :: " + newString);
	}
}
