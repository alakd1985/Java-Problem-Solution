package FoxQAPracticeProblem;

import java.util.Scanner;

public class FirstOccurenceofGivenElement {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 5, 5, 5, 6, 9 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any number:");

		int num = scanner.nextInt();

		scanner.close();

		boolean isfound = false;

		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				System.out.println(
						"The first occurance of given number " + a[i] + " in the array is available at index " + i);
				isfound = true;
				break;
			}

		}
		if (!isfound) {
			System.out.println("The number is not found in the array");
		}

	}

}
