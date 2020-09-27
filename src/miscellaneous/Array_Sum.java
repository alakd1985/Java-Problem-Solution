package miscellaneous;

import java.util.Scanner;
public class Array_Sum{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = s.nextInt();
		int[] myArray = new int[length];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
		int sum = 0;
		
		for (int i : myArray) {
			sum = sum + i;
		}

		System.out.println("The sum of the numbers are: " + sum);
	}
}
