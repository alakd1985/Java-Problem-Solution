package FoxQAPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacentOddEven {

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

		int i = 0;

		for (int j = i + 1; j < array.length; j++) {
			if (array[j] % 2 != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
		}

		System.out.println("The New array:: " + Arrays.toString(array));
	}

}
