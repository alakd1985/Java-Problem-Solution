package FoxQAPracticeProblem;

import java.util.HashSet;
import java.util.Scanner;

public class DupliFindHashset {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to add: ");
		int n = scanner.nextInt();
		int[] x = new int[n];
		HashSet<Integer> hSet = new HashSet<Integer>();

		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter the " + (i + 1) + "the" + " Number ");
			x[i] = scanner.nextInt();

		}

	}

}
