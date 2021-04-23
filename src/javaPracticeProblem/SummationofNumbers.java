package javaPracticeProblem;

import java.util.Scanner;

public class SummationofNumbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the nth number :: ");
		int nthnumber = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= nthnumber; i++) {
			sum += i;
		}
		System.out.println("The sum of the all the numbers are:: " + sum);
	}
}
