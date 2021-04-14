package FoxQAPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByThreeElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to put: ");
		int count = scanner.nextInt();
		int[] a = new int[count];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + (i + 1) + " number: ");
			a[i] = scanner.nextInt();
		}
		System.out.println("The elements are: " + Arrays.toString(a));
		for (int j = 0; j < 3; j++) {
			int first = a[0];

			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}

			a[a.length - 1] = first;

		}
		System.out.println("After the rotation ::" + Arrays.toString(a));
	}
}
