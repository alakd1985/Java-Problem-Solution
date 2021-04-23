package javaPracticeProblem;

import java.util.Scanner;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many rows want to print:: ");
		int rows = scanner.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
