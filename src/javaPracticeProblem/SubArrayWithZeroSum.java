package javaPracticeProblem;

import java.util.ArrayList;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
		checkZero(nums1);
	}

	public static void checkZero(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			for (int j = i; j < num.length; j++) {
				sum += num[j];
				list.add(num[j]);
				if (sum == 0) {
					System.out.println("The sumarray with sum zero is::" + list);
				}
			}

			list.clear();
		}
	}

}
