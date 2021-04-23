package javaPracticeProblem;

import java.util.Scanner;

public class ReversedNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a random number:: ");
		int num = scanner.nextInt();
		int reversedNumber = 0;
		while (num > 0) {
			int reminder = num % 10;
			reversedNumber = reversedNumber * 10 + reminder;
			num = num / 10;
		}
		System.out.println("The reversed number is: " + reversedNumber);
		scanner.close();
	}

}
