package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacentInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to put: ");
		int count = scanner.nextInt();
		int[] array = new int[count];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " number: ");
			array[i] = scanner.nextInt();
		}

		System.out.println("The original array:: " + Arrays.toString(array));

		boolean found1 = false;
		boolean found2 = false;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				found1 = true;
			}
			if (array[i] == array[i + 1]) {
				found2 = true;
			}
		}
		System.out.printf(String.valueOf(found1 != found2));
		System.out.printf("\n");
	}
}
