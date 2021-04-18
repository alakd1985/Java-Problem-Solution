package FoxQAPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class LeadersofElements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to put: ");
		int count = scanner.nextInt();
		int[] a = new int[count];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + (i + 1) + " number: ");
			a[i] = scanner.nextInt();
		}
		System.out.println("The array is:: " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			int j;
			for (j = i + 1; j < a.length; j++) {
				if (a[i] <= a[j]) {
					break;
				}
			}
			if (j == a.length) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
