package pattern;

import java.util.Scanner;

public class ReversedPyramidStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows to put: ");
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = rows - i; k > 0; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
