package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class NotAdjacentThreeTimes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to put: ");
		int count = scanner.nextInt();
		int[] array = new int[count];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " number: ");
			array[i] = scanner.nextInt();
		}
		System.out.println("The elements are: " + Arrays.toString(array));
		System.out.println("What number you want to check? ");
		int numberCheck = scanner.nextInt();
		int countNumber = 0;
		boolean found = false;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == numberCheck) {
				countNumber++;
			}
		}
		if (countNumber == 3) {
			System.out.println("The count of the specific number is 3");
		} else {
			System.out.println("The count of the specific number is less than 3");
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == numberCheck && array[i + 1] == numberCheck) {
				System.out.printf("The Numbers are Adjacent");
				break;
			}
		}
		// if (array[i] == numberCheck && array[i + 1] == numberCheck)
	}

}
