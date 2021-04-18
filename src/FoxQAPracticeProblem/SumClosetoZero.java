package FoxQAPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class SumClosetoZero {

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

		int minimumSum = a[0] + a[1];
		int originalSum = 0;
		int min1 = 0, min2 = 1;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (originalSum < minimumSum) {
					min1 = i;
					min2 = j;
					minimumSum = originalSum;
				}
			}
		}

		System.out.println("The firt minimum number is :: " + a[min1]);
		System.out.println("The second minimum number is :: " + a[min2]);
	}

}
