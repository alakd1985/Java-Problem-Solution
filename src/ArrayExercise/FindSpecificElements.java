package ArrayExercise;

import java.util.Arrays;

public class FindSpecificElements {

	public static boolean findElements(int[] arr, int n1, int n2) {
		for (int x : arr) {
			if (x == n1 || x == n2) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array_nums = { 77, 77, 65, 65, 65, 77 };
		System.out.println("Original Array: " + Arrays.toString(array_nums));
		int num1 = 77;
		int num2 = 65;

		System.out.println("Result: " + findElements(array_nums, num1, num2));
	}

}
