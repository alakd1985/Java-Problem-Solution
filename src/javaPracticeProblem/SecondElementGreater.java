package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class SecondElementGreater {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to put: ");
		int count = scanner.nextInt();
		int[] array = new int[count];
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " number: ");
			array[i] = scanner.nextInt();
		}
		System.out.println("Original array:: " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After sorting the array:: " + Arrays.toString(array));

		for (int i = 1; i < array.length; i++) {
			if (i % 2 == 0) {// here the value of i is 1,2,3,4 etc NOT the value in the index
				int temp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = temp;
			}
		}

		System.out.println("After rearranging the array:: " + Arrays.toString(array));

	}

}
