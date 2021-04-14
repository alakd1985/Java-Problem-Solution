package FoxQAPracticeProblem;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character:  ");
		char c = scanner.next().toLowerCase().charAt(0);
		boolean isVowel = false;
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			isVowel = true;
		}

		if (isVowel == true) {
			System.out.println("This is a vowel");
		} else {
			System.out.println("This is a consonent");
		}
	}

}
