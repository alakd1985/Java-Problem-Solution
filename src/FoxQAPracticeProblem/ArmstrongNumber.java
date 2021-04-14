package FoxQAPracticeProblem;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int originalnumber = scanner.nextInt();
		int number = originalnumber;
		int sum = 0;

		while (number > 0) {
			int reminder = number % 10;
			number = number / 10;
			sum += reminder * reminder * reminder;

		}

		if (sum == originalnumber) {
			System.out.println("This is a Armstrong number");
		} else {
			System.out.println("This is not an Armstrong number");
		}
	}

}
