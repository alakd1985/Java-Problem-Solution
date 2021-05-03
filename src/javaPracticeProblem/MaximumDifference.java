package javaPracticeProblem;

import java.util.Arrays;

public class MaximumDifference {

	public static void main(String[] args) {
		int[] n = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
		System.out.println("\nOriginal array: " + Arrays.toString(n));

		System.out.println("The maximum differece is:: " + maxdiff(n));
	}

	public static int maxdiff(int[] nums) {
		int maxiDifference = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				maxiDifference = Integer.max(maxiDifference, nums[j] - nums[i]);
			}
		}
		return maxiDifference;
	}
}
