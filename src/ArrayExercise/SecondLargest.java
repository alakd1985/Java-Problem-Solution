package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements for array: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the " + (i + 1) + " th number");
			a[i] = scanner.nextInt();
		}

		System.out.println("Arrays to string : " + Arrays.toString(a));

		Arrays.sort(a);

		int index = a.length - 1;
		while (a[index] == a[a.length - 1]) {
			index--;
		}

		System.out.println("The second largest value is: " + a[index]);
	}

}
