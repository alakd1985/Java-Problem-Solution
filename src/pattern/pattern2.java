package pattern;

import java.util.Scanner;

/* 				1
				2 6
				3 7 10 
				4 8 11 13
				5 9 12 14 15*/
public class pattern2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();
		for (int i = 1; i <= row; i++) {
			int num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "");
				num = num + row - j;
			}
			System.out.println();
		}

	}

}
