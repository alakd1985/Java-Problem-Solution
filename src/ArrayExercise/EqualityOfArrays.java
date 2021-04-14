package ArrayExercise;

public class EqualityOfArrays {

	public static void equalityOfArrays(int[] a, int[] b) {
		boolean equal = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					equal = false;
				}
			}
		} else {
			equal = false;
		}
		if (equal) {
			System.out.println("The arrys are equal");
		} else {
			System.out.println("The arrays are not equal");
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 5, 1, 2, 3 };
		int[] array3 = { 6, 5, 78, 45 };
		int[] array4 = { 1, 2, 3, 4 };

		equalityOfArrays(array1, array4);
		equalityOfArrays(array2, array3);
	}
}
