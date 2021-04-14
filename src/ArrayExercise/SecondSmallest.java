package ArrayExercise;

public class SecondSmallest {

	public static int secondSmallest(int a[], int total) {
		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		return a[1];
	}

	public static void main(String[] args) {
		int a[] = { 1, 12, 5, 6, 3, 10 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("The second smallest number : " + secondSmallest(a, 6));
	}

}
