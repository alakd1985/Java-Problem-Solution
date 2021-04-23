package javaPracticeProblem;

public class CompareArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 6 };
		int b[] = { 1, 2, 3, 5 };
		boolean comparisonStaus = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					comparisonStaus = false;
					break;
				} else {
					comparisonStaus = true;
				}
			}
		}
		if (comparisonStaus) {
			System.out.println("This is a same string");
		} else {
			System.out.println("This is not a same string");
		}

	}

}
