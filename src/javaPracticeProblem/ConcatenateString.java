package javaPracticeProblem;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a line:: ");
		String line = scanner.nextLine();
		System.out.println("Enter the string to concatenate:: ");
		String concaString = scanner.next();
		System.out.println("How many times to repeat::");
		int n = scanner.nextInt();

		do {
			concaString = concaString.concat(line);

			n--;
		} while (n != 0);
		System.out.println(concaString);
	}

}
