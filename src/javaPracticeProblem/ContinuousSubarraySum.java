package javaPracticeProblem;

import java.util.Arrays;

public class ContinuousSubarraySum {

	public static void main(String[] args) {
		int[] array = { 1, 2, -3, -4, 0, 6, 7, 8, 9 };
		int len = array.length;
		System.out.println("\nOriginal array: " + Arrays.toString(array));
		System.out.println("The largest sum of contiguous sub-array: " + largest_sum(array, len));

	}

	public static int largest_sum(int[] a, int b) {
		int current_max = a[0];
		int sofar_max = a[0];
		for (int i = 0; i < a.length; i++) {
			current_max = Math.max(a[i], current_max + a[i]);
			sofar_max = Math.max(sofar_max, current_max);
		}
		return sofar_max;

	}
}
