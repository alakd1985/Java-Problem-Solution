package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to put");
		int number = scanner.nextInt();
		int[] ar = new int[number];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter the " + (i + 1) + "th number");
			ar[i] = scanner.nextInt();
		}

		System.out.println("The elements are:: " + Arrays.toString(ar));

		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j] && i != j) {
					System.out.println("The duplicate element is :: " + ar[j]);
				}
			}
		}

	}

}
