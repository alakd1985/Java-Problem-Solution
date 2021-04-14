package FoxQAPracticeProblem;

import java.util.Scanner;

public class EachCapitalWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line : ");
		String line = scanner.nextLine();
		String[] words = line.split(" ");
		String finalStatement = "";
		for (String word : words) {
			char[] ca = word.toCharArray();
			char c = ca[0];
			String firstChar = String.valueOf(c).toUpperCase();
			String capitializedWord = firstChar;

			for (int i = 1; i < ca.length; i++) {
				capitializedWord = capitializedWord + ca[i];
			}
			finalStatement = finalStatement + capitializedWord + " ";

		}
		System.out.println("The final statement is : " + finalStatement);

	}

}
