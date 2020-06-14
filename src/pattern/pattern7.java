package pattern;

import java.util.Scanner;

				/*  7 6 5 4 3 2 1
					6 5 4 3 2 1
					5 4 3 2 1
					4 3 2 1
					3 2 1
					2 1
					1*/
public class pattern7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();
		
		for (int i = row; i>=1; i--) {
			for (int j = i; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
