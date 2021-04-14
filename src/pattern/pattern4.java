package pattern;

import java.util.Scanner;

/*1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 
6 5 4 3 2 1
7 6 5 4 3 2 1*/
public class pattern4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows::  ");
		int row = input.nextInt();
		for (int i = 1; i < row; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
