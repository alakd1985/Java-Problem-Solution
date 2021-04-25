package javaPracticeProblem;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMatrix {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int array1[][] = new int[2][3];
		System.out.print("Enter the elements of an array = ");
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array1[0].length - 1; j++) {
				array1[i][j] = input1.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(array1));
		System.out.println("Please enter the number to search::");
		int num = input1.nextInt();
		int count = 0;
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array1[0].length - 1; j++) {
				if (array1[i][j] == num) {
					System.out.println("The Number is in the Index of = " + i + "," + j);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("The Number you've Searched is not in the list");
		}
	}
}
