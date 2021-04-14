package FoxQAPracticeProblem;

import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Strting number:  ");
		int startNumber = scanner.nextInt();
		System.out.println("Enter the ending number:  ");
		int endingNumber = scanner.nextInt();
		int sum = 0;
		for (int i = startNumber; i <= endingNumber; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of all the even numbers are::: " + sum);
	}
}
