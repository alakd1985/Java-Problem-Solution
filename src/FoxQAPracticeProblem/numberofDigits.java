package FoxQAPracticeProblem;

import java.util.Scanner;

public class numberofDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int num = scanner.nextInt();
		int digitcount = 0;
		scanner.close();

		while (num > 0) {
			digitcount++;
			num = num / 10;
		}
		System.out.println("The number of digits in the given number is: " + digitcount);
	}

}
