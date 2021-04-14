package FoxQAPracticeProblem;

import java.util.Scanner;

public class CountingFactors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number::  ");
		int input = scanner.nextInt();
		int count = 0;

		for (int i = 1; i <= input; i++) {
			if (input % i == 0) {
				System.out.println(i);
				count++;
			}
		}

		System.out.println("The number of factors are:: " + count);
	}
}
