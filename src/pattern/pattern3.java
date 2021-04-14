package pattern;

/*1111111
1111122
1111333
1114444
1155555
1666666
7777777 */

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(1);
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
