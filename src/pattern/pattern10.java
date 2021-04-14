package pattern;

import java.util.Scanner;

/*7 6 5 4 3 2 1
7 6 5 4 3 2 
7 6 5 4 3 
7 6 5 4
7 6 5
7 6
7*/
public class pattern10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
