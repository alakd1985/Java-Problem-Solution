package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreatestElement {

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

		for (int i = 0; i < array.length; i++) {
			int maxValue = Integer.MIN_VALUE;
			for (int j = i + 1; j < array.length; j++) {

				if (maxValue < array[j]) {
					maxValue = array[j];
				}

			}
			if (i == array.length - 1) {
				array[i] = -1;
			} else {
				array[i] = maxValue;
			}
		}

		System.out.println("After modification of the array:: " + Arrays.toString(array));

	}

}
