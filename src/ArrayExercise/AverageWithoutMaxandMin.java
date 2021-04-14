package ArrayExercise;

import java.util.Arrays;

public class AverageWithoutMaxandMin {

	public static void main(String[] args) {
		int[] array_nums = { 5, 7, 2, 4, 9, 3, 10, -9, 54, 7 };
		System.out.println("The original array is :: " + Arrays.toString(array_nums));
		int max = array_nums[0];
		int min = array_nums[0];
		int sum = array_nums[0];

		for (int i = 0; i < array_nums.length; i++) {
			sum += array_nums[i];
			if (array_nums[i] > max) {
				max = array_nums[i];
			} else if (array_nums[i] < min) {
				min = array_nums[i];
			}
		}
		float average = ((sum - min - max) / (array_nums.length - 2));
		System.out.println("The average is " + average);
	}
}
