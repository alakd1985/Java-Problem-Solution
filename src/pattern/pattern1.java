package pattern;

import java.util.Scanner;

/*  1
	23
	456
	78910
	1112131415
	161718192021
	22232425262728
	2930313233343536
	373839404142434445
	46474849505152535455 */
public class pattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int rows = scanner.nextInt();
		int value = 1;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value);
				value++;
			}
			System.out.println();
		}
	}
}
