package javaPracticeProblem;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line");
		String st = scanner.nextLine();
		int j = 0;

		for (int i = 1; i < st.length(); i++) {
			if (j < st.length()) {
				if (st.charAt(i) == st.charAt(j)) {
					j++;
				}
			} else if (j > 0) {
				j = 0;
				i--;
			}
		}

		System.out.println("The longest substring is :: " + st.substring(0, j));

	}
}
