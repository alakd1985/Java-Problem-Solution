package javaPracticeProblem;

import java.util.Scanner;

public class FibunacciNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int number = scanner.nextInt();
		int a = 1, b = 1;
		int f = 0;

		while (f <= number) {
			f = a + b;
			if (f > number) {
				break;
			}

			System.out.print(f + " ");

			a = b;
			b = f;

		}

	}

}
