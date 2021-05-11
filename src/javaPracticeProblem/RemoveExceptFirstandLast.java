package javaPracticeProblem;

import java.util.Scanner;

public class RemoveExceptFirstandLast {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line:: ");
		String s = scanner.nextLine();
		String newS = "";
		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && i < s.length() - 1 && s.charAt(i) == 't') {
				continue;
			}
			newS += s.charAt(i);
		}
		System.out.println("The new string is: " + newS);
	}
}
