package javaPracticeProblem;

import java.util.Scanner;

public class ConsecutiveCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line:: ");
		String line = scanner.nextLine();

		char c = line.charAt(0);
		boolean flag = false;

		for (int i = 1; i < line.length(); i++) {
			if (line.charAt(i) == c && line.charAt(i - 1) == c) {
				flag = true;
				System.out.println("True");
				break;
			}

		}
		if (!flag) {
			flag = false;
			System.out.println("False");
		}

	}
}