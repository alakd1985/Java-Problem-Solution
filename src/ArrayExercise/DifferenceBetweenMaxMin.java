package ArrayExercise;

import java.util.Arrays;

public class DifferenceBetweenMaxMin {

	public static void main(String[] args) {
		int[] array = { 1, 9, 45, 76, 34, 54, 5, 6, 8, 7 };
		System.out.println("Array to string :" + Arrays.toString(array));

		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("The difference between the max and min value is:: " + (max - min));
	}
}
