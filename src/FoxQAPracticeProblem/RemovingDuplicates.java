package FoxQAPracticeProblem;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingDuplicates {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to add: ");
		int n = scanner.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < x.length; i++) {
			System.out.println("Enter the " + i + "th" + " Number ");
			x[i] = scanner.nextInt();
		}

		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < x.length; i++) {
			s.add(x[i]);
		}

		Integer[] b = s.toArray(new Integer[s.size()]);
		System.out.println("After removing the duplicate values" + Arrays.toString(b));

	}

}
