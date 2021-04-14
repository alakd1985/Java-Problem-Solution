package ArrayExercise;

public class ValueCheck {
	public static boolean check(int[] x, int n) {
		for (int p : x) {
			if (n == p) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 129, -5, 65, 89 };
		System.out.println(check(number, 10));
	}

}
