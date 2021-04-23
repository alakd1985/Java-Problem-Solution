package javaPracticeProblem;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year:: ");
		int year = scanner.nextInt();
		boolean isLeapYear = false;
// If the year is divisible by 4 and not by 100 then it is a leap year
// if the year is divisible by 4 and 100 and 400 then its also a leap year
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;
			}

		} else {
			isLeapYear = false;
		}

		if (isLeapYear == true) {
			System.out.println("The year " + year + " IS a Leap year");
		} else {
			System.out.println("The year " + year + " is NOT a leap year");
		}

	}

}
