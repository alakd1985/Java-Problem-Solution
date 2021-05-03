package javaPracticeProblem;

import java.util.Arrays;

public class SubarraySumZero {
	public static void main(String[] args) throws Exception {
		int[] nums1 = { 1, 2, -2, 3, 4, 5, 6 };
		System.out.println("Original Array " + Arrays.toString(nums1));
		System.out.println("Does the said array contain a subarray with 0 sum: " + checkSumEqZero(nums1));

		int[] nums2 = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Original Array " + Arrays.toString(nums2));
		System.out.println("Does the said array contain a subarray with 0 sum: " + checkSumEqZero(nums2));

		int[] nums3 = { 1, 2, -3, 4, 5, 6 };
		System.out.println("Original Array " + Arrays.toString(nums3));
		System.out.println("Does the said array contain a subarray with 0 sum: " + checkSumEqZero(nums3));
	}

	public static boolean checkSumEqZero(int[] arr) {
		boolean flog = false;
		/* i determine the start of the subarray */
		for (int i = 0; i < arr.length; i++) {
			/* j determine the end of the subarray */
			for (int j = i + 1; j <= arr.length; j++) {
				int sum = 0;
				/* the subarray */
				for (int k = i; k < j; k++) {
					sum += arr[k];
				}
				if (sum == 0) {
					flog = true;
					break;
				}
			}
			if (flog)
				break;
		}
		return flog;
	}
}