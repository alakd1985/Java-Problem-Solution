package javaPracticeProblem;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number:");

		int num1 = scanner.nextInt();

		System.out.println("Enter second number:");

		int num2 = scanner.nextInt();
		int gcd = 0;
		for (int i = 1; i < num1 && i < num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		System.out.println("The greatest common divisor of the two numbers is:: " + gcd);

	}

}
