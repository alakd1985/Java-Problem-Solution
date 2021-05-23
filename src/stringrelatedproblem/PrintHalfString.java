package stringrelatedproblem;

import java.util.Scanner;

public class PrintHalfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the line:");

		String string = scanner.nextLine();
		int halfsize = string.length() / 2;
		System.out.println("The first half of the string is :: " + string.substring(0, halfsize));
	}
}
