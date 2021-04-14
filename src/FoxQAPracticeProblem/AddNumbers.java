package FoxQAPracticeProblem;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fnumber = scanner.nextInt();
		System.out.println("Enter the second number");
		int snumber = scanner.nextInt();
		int sum = fnumber + snumber;
		System.out.println("The sum of two numbers are:: " + sum);
	}
}
