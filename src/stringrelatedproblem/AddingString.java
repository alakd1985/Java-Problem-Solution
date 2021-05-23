package stringrelatedproblem;

import java.util.Scanner;

public class AddingString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write a word: ");
		String word = scanner.nextLine();
		System.out.println("Please write the second word:: ");
		String word1 = scanner.nextLine();
		System.out.println("How many number of times you want to repeat the word:: ");
		String newWord = "";
		int rep = scanner.nextInt();
		for (int i = 0; i < rep; i++) {
			newWord += word + word1;
		}
		System.out.println("The new word is :" + newWord.substring(0, newWord.length() - word1.length()));
	}
}
