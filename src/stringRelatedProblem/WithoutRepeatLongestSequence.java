package stringRelatedProblem;

import java.util.Arrays;

public class WithoutRepeatLongestSequence {

	public static void main(String[] args) {
		int[] array = { 1, 10, 2, 90, 4, 3, -8, 5, 6, 21, 9, 21 };
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Original array is : " + Arrays.toString(array));

		int count = 1;
		int initialIndex = 0;
		int endIndex = 0;
		int largest = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] == array[i] + 1) {
				count++;
			} else {
				if (count > largest) {
					largest = count;
					endIndex = i;
				}
				count = 0;// endIndex + 1 - largest
			}
		}
		for (int i = 0; i <= endIndex; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
