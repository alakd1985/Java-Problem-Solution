package ArrayExercise;

public class SumofValues {

	public static void main(String[] args) {
		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int x : my_array) {
			sum += x;
		}
		System.out.println("The sum of the numbers are :: " + sum);
	}

}
