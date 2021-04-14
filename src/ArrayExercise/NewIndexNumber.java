package ArrayExercise;

public class NewIndexNumber {

	public static int newIndex(int[] a) {
		int index = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[index - 1]) {
				a[index++] = a[i];
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int nums[] = { 20, 20, 30, 40, 50, 50, 50, 90, 50, 70, 10, 0, 70, 90 };
		System.out.println("Original length of the array is " + nums.length);
		System.out.println("The new length of the array is : " + newIndex(nums));
	}
}
