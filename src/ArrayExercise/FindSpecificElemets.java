package ArrayExercise;

import java.util.Arrays;

public class FindSpecificElemets {

	public static boolean specificElements(int[] a, int n1, int n2) {
		for (int n : a) {
			boolean r = n != n1 && n != n2;
			if (r) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] array_nums = { 77, 77, 65, 65, 65, 77 };
		System.out.println("Original Array: " + Arrays.toString(array_nums));
		int num1 = 78;
		int num2 = 65;

		System.out.println("Result: " + specificElements(array_nums, num1, num2));
	}
}
