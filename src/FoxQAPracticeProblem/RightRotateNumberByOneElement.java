package FoxQAPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateNumberByOneElement {

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

		int last = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = last;
		System.out.println("After the rotation ::" + Arrays.toString(array));
	}

}
