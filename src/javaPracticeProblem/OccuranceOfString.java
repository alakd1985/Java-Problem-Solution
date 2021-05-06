package javaPracticeProblem;

import java.util.Scanner;

public class OccuranceOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line:: ");
		String line = scanner.nextLine();
		System.out.println("Enter the string to occur:: ");
		String s = scanner.next();
		int count = 0;

		for (int i = s.length(); i <= line.length(); i++) {
			if (line.substring(i - s.length(), i).equals(s)) {
				count++;
			}
		}
		System.out.printf("The occurance of '%s' is '%s' count", s, count);

	}

}
