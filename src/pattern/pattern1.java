package pattern;

import java.util.Scanner;

				/*  1
					2 3
					4 5 6
					7 8 9 10
					11 12 13 14 15*/
public class pattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int rows = scanner.nextInt();
		int value = 1;

		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(value);
				value++ ;
			}
			System.out.println();
		}

	}

}
