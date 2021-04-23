package javaPracticeProblem;

import java.util.Scanner;

public class StartingSubstring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input String: ");
		String str1 = input.nextLine();
		System.out.print("Input word to search: ");
		String str2 = input.nextLine();
		int position = -1;
		int len = str2.length();
		for (int i = 0; i < str1.length() - 1; i++) {
			if (str1.substring(i, len).equals(str2)) {
				position = i;
				break;
			}
			len++;
		}
		System.out.println((position == -1) ? " Not found" : position);
	}
}
