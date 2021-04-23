package javaPracticeProblem;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line to consider as palindrome  ");
		String inputline = scanner.nextLine();
		char[] c = inputline.toCharArray();
		String rev = "";

		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		System.out.println("The reverse string is :: " + rev);

		if (inputline.equals(rev)) {
			System.out.println("The entered line is palindrome!!");
		} else {
			System.out.println("The entered line is not a palindrome !!");

		}

	}

}
