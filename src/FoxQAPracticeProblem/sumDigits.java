package FoxQAPracticeProblem;

import java.util.Scanner;

public class sumDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to count:  ");
		int input = scanner.nextInt();
		int sumdigits = 0;
		while (input > 0) {
			int reminder = input % 10;
			sumdigits = sumdigits + reminder;
			input = input / 10;
		}
		System.out.println("The sum of digits are : " + sumdigits);

	}

}
