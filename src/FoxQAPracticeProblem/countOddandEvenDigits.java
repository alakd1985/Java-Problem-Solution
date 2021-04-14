package FoxQAPracticeProblem;

import java.util.Scanner;

public class countOddandEvenDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to count:: ");
		int number = scanner.nextInt();
		// scanner.close();
		int oddcount = 0;
		int evencount = 0;
		outer: while (number > 0) {

			int reminder = number % 10;

			if (reminder % 2 == 0) {
				evencount++;
			}
			if (reminder % 2 != 0) {
				oddcount++;
			}

			number = number / 10;

		}

		System.out.println("The total number of odd numbers are:: " + oddcount);
		System.out.println("The total number of even numbers are:: " + evencount);
	}

}
