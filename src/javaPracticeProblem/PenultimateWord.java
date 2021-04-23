package javaPracticeProblem;

import java.util.Scanner;

public class PenultimateWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the line:: ");
		String line = scanner.nextLine();
		String[] word = line.split(" ");
		System.out.println("The Penultimate word is :: " + word[word.length - 2]);
	}
}
