package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestandSecondSmallest {
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

		int smallest = array[0];
		int secondSmallest = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}

		System.out.println("The smallest number in the array is:: " + smallest);

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < secondSmallest && array[i] != smallest) {
				secondSmallest = array[i];
			}
		}
		System.out.println("The second smallest number is:: " + secondSmallest);

	}

}
