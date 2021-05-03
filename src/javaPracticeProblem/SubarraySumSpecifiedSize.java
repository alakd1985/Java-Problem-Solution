package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class SubarraySumSpecifiedSize {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Original array: " + Arrays.toString(myArray));
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is size of the subarray:: ");
		int lenofSubarray = scanner.nextInt();

		int minSum = Integer.MAX_VALUE;
		int startingIndex = 0;
		int endingIndex = 0;
		for (int i = 0; i < myArray.length - lenofSubarray - 1; i++) {
			int sum = 0;
			for (int j = i; j < lenofSubarray + i; j++) {
				sum += myArray[j];
			}
			if (sum < minSum) {
				minSum = sum;
				startingIndex = i;
				endingIndex = lenofSubarray + i;
			}
		}
		System.out.printf("Sub-array from %d to %d and sum is: %d", startingIndex, endingIndex, minSum);
	}

}
