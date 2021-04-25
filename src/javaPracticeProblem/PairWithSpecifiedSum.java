package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class PairWithSpecifiedSum {
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
		System.out.println("Enter the sum you want to see: ");
		int sum = scanner.nextInt();
		boolean flag = false;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					flag = true;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Array has a pair of elements with sum" + sum);
		} else {
			System.out.println("Array has no pair with sum ");
		}
	}

}
