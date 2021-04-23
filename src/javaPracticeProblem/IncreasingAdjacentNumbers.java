package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingAdjacentNumbers {
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
		int result = 1;
		for (int i = 0; i < array.length - 3; i++) {
			if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
				result = 0;
			}
		}
		if (result == 1) {
			System.out.println(String.valueOf(false));
		} else {
			System.out.println(String.valueOf(true));
		}
	}
}
