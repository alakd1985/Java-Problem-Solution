package stringrelatedproblem;

import java.util.Scanner;

public class SumofNumbersInString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a line :: ");
		String g = scanner.nextLine();
		System.out.println("The sum of numbers in the string are:: " + sumOfTheNumbers(g));
	}

	public static int sumOfTheNumbers(String word) {
		int sum = 0;
		String temp = "0";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			// if the letter is number
			if (Character.isDigit(ch)) {
				temp += ch;
			}
			// if the letter is alphabet
			else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}

		return sum + Integer.parseInt(temp);

	}

}
