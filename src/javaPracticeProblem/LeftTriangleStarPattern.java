package javaPracticeProblem;

import java.util.Scanner;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows want to print:: ");
		int rows = scanner.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 2 * (rows - i); j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
