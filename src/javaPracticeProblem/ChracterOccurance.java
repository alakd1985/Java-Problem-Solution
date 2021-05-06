package javaPracticeProblem;

import java.util.Scanner;

public class ChracterOccurance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line:: ");
		String line = scanner.nextLine();

		char character = 'g';
		int count = 0;
		for (int i = 0; i < line.length() - 1; i++) {
			if (line.charAt(i) == character) {
				count++;
			}

		}
		if (count == 0) {
			System.out.println("There is no specified character ");

		} else {
			System.out.println(count);
		}

	}
}
