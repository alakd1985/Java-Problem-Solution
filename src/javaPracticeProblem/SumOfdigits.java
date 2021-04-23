package javaPracticeProblem;

import java.util.Scanner;

public class SumOfdigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to calculate the digits::: ");
		int sum = 0;
		int number = scanner.nextInt();
		while (number != 0) {
			int reminder = number % 10;
			sum += reminder;
			number = number / 10;
		}
		System.out.println("The sum of all the digits are:: " + sum);

	}

}
