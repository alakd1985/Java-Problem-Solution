package javaPracticeProblem;

import java.util.Arrays;

public class EqulibriumIndices {

	public static void main(String[] args) {
		int[] nums = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println("Original array: " + Arrays.toString(nums));
		solutionEquilibrium(nums);
	}

	public static void solutionEquilibrium(int[] num) {
		int totalSum = 0;
		for (int x : num) {
			totalSum += x;
		}
		int runningSum = 0;

		for (int i = 0; i < num.length; i++) {
			int x = num[i];
			if (totalSum - runningSum - x == runningSum) {
				System.out.println("Equilibrium index is found at :: " + i);
			}
			runningSum += x;
		}
	}
}
