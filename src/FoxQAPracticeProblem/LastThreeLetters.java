package FoxQAPracticeProblem;

import java.util.Scanner;

public class LastThreeLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string/line, last three lines to be extracted::  ");
		String input = scanner.nextLine();

		char[] g = input.toCharArray();
		int l = g.length;
		String lstThreeletter = "";

		for (int i = l - 1; i > l - 4; i--) {
			lstThreeletter = lstThreeletter + g[i];
		}
		System.out.println("The last three letters are : " + lstThreeletter);
	}
}
