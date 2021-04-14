package FoxQAPracticeProblem;

import java.util.Scanner;

public class AverageofNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to put: ");
		int count = scanner.nextInt();
		double[] array = new double[count];
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " number: ");
			array[i] = scanner.nextDouble();
		}

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		double average = sum / count;
		System.out.println("The average is :: " + average);

	}

}
