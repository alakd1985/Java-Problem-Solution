package ArrayExercise;

import java.util.Arrays;

public class SumofAllTens {

	public static boolean check(int[] num, int searchNumber, int fixedNumber) {
		int sum = 0;
		for (int x : num) {
			if (x == searchNumber) {
				sum += searchNumber;
			}
			if (sum > fixedNumber) {
				break;
			}
		}
		return sum == fixedNumber;
	}

	public static void main(String[] args) {

		int[] array_nums = { 10, 77, 10, 54, -11, 10 };
		System.out.println("Original Array: " + Arrays.toString(array_nums));
		int search_num = 10;
		int fixed_sum = 30;
		boolean v = check(array_nums, search_num, fixed_sum);
		System.out.println(v);

	}

}
