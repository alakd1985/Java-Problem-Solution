package FoxQAPracticeProblem;

import java.util.Scanner;

public class IntegerCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int num = scanner.nextInt();
		int count = 0;
		while (num != 1) {
			System.out.println(num);
			if (num % 2 == 0) {
				num = num / 2;
				count++;
			} else {
				num = (3 * num + 1) / 2;
				count++;
			}
		}
		System.out.println("Total count is :: " + count);

	}

}
