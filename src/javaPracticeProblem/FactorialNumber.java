package javaPracticeProblem;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = scanner.nextInt();
		int fact = Factorial(num);
		System.out.println("The factorial of the number is:: " + fact);
	}

	public static int Factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * Factorial(n - 1);
		}
	}
}
