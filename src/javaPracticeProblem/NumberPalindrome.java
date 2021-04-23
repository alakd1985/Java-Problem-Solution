package javaPracticeProblem;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int originalNum = scanner.nextInt();
		int n = originalNum;
		int revNumber = 0;

		while (n > 0) {
			int reminder = n % 10;
			n = n / 10;
			revNumber = revNumber * 10 + reminder;

		}
		System.out.println("The reversed number is :: " + revNumber);
		if (revNumber == originalNum) {
			System.out.println("The entered number is palindrome number  ");
		} else {
			System.out.println("The reversed number is not palindrome");
		}
	}

}
