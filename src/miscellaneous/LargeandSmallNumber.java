package miscellaneous;

import java.util.Scanner;

public class LargeandSmallNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = s.nextInt();
		int[] myArray = new int[length];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
		
		//int[] string = { -40, -60, 0, 56, 3, 7, 90, 32 };
		int large = myArray[0];
		int small = myArray[0];

		for (int i = 1; i < myArray.length; i++) {

			if (myArray[i] > large) {
				large = myArray[i];
			} else if (myArray[i] < small) {
				small = myArray[i];

			}

		}

		System.out.println("The largest number is :" + large);
		System.out.println("The largest number is :" + small);
	}

}
