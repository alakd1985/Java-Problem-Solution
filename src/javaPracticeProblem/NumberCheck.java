package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheck {

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

		boolean tested = false;
		System.out.println("Please  enter the first number to search: ");
		int x = scanner.nextInt();
		System.out.println("Please  enter the second number to search: ");
		int y = scanner.nextInt();
		int value = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == x) {
				tested = true;
			}
			if (tested && array[i] == y) {
				System.out.println(String.valueOf(true));
				value++;
			}
		}

		if (value == 0) {
			System.out.println(String.valueOf(false));
		}
	}

}
