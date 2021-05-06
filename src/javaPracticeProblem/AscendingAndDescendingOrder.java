package javaPracticeProblem;

import java.util.Arrays;

public class AscendingAndDescendingOrder {

	public static void main(String[] args) {
		String[] str = { "Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory" };
		System.out.println("Original string: " + Arrays.toString(str));

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() < str[j].length()) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}

		System.out.println("After sorting of the array:: " + Arrays.toString(str));

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() > str[j].length()) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}
			}
		}

		System.out.println("After sorting of the array:: " + Arrays.toString(str));

	}
}
