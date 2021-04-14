package ArrayExercise;

import java.util.Arrays;

public class WithoutZeroandOne {

	public static boolean testNumber(int[] numbers) {
		for (int x : numbers) {
			if (x == 0 || x == 1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] v = { 2, 4, 5, 6, 9 };
		System.out.println("Original Array :: " + Arrays.toString(v));
		testNumber(v);
		System.out.println(testNumber(v));

	}
}
