package javaPracticeProblem;

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string/line to be reversed::  ");
		String input = scanner.nextLine();
		char[] c = input.toCharArray();
		String rev = "";

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println("The reversed string is :: " + rev);
	}

}
