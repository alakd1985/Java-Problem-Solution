package FoxQAPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ElementSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you want to put:  ");
		int n = scanner.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + "th number");
			array[i] = scanner.nextInt();
		}

		System.out.println("The elements are: " + Arrays.toString(array));

		System.out.println("Enter the number you want to search:: ");
		int sn = scanner.nextInt();
		boolean found = false;

		for (int i = 0; i < array.length; i++) {
			if (sn == array[i]) {
				System.out.println("The number is at the " + i + "th index");
				found = true;
				break;
			}

		}
		if (!found) {
			System.out.println("The number is not found in the given array");
		}

	}

}
