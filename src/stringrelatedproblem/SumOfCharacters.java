package stringrelatedproblem;

import java.util.Scanner;

public class SumOfCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a line:: ");
		String line = scanner.next();
		int sum = 0;
		for (int i = 0; i < line.length() - 1; i++) {
			char c = line.charAt(i);
			if (c >= '0' && c <= '9') {
				String ch = c + "";
				sum += Integer.parseInt(ch);
			}
		}
		System.out.println("The sum of the digits in the string is: " + sum);

	}

}
