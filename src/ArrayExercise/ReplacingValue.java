package ArrayExercise;

import java.util.Arrays;

public class ReplacingValue {

	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int newPosition = 4;
		int numbertobeInserted = -3;

		for (int i = my_array.length - 1; i > my_array.length; i--) {
			my_array[i] = my_array[i - 1];
		}
		my_array[newPosition] = numbertobeInserted;
		System.out.println("After inserting a new value: " + Arrays.toString(my_array));
	}

}
