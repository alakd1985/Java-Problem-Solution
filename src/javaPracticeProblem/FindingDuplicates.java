package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class FindingDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add: ");
		int n = scanner.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter the " + i + "th" + " Number ");
			x[i] = scanner.nextInt();
		}
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println(x[i] + " is the duplicate value");
				}
			}
		}
	}

}
