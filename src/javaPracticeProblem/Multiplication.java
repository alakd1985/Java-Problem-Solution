package javaPracticeProblem;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be multiplied:  ");
		int fnumber = scanner.nextInt();
		System.out.println("Enter the nth number to be multiplied:  ");
		int nthnumber = scanner.nextInt();

		for (int i = 1; i <= nthnumber; i++) {
			System.out.println("The result is: " + fnumber + "*" + i + "=" + fnumber * i);
		}
	}

}
