package FoxQAPracticeProblem;

import java.util.Scanner;

public class UniqueDigitNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		int number = scanner.nextInt();
		int amount = 0;

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				for (int k = 1; k <= number; k++) {
					if (i != j && j != k && k != i) {
						amount++;
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
		System.out.println("The total numbers are:: " + amount);
	}
}
