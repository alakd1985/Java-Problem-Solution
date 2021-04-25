package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveIntegersBeforeNegativeIntegers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you want to put:  ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " th number");
			array[i] = scanner.nextInt();
		}
		System.out.println("The elements are: " + Arrays.toString(array));
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("After sorting the array ::" + Arrays.toString(array));
	}
}
