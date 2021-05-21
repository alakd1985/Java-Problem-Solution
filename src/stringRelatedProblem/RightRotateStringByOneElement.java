package stringRelatedProblem;

public class RightRotateStringByOneElement {

	public static void main(String[] args) {

		String line = "Alakkantidutta";
		char[] ca = line.toCharArray();

		char last = ca[ca.length - 1];
		for (int i = ca.length - 1; i > 0; i--) {
			ca[i] = ca[i - 1];
		}
		ca[0] = last;
		StringBuffer sBuffer = new StringBuffer();
		for (char x : ca) {
			sBuffer.append(x);
		}

		System.out.println("After the rotation the number is ::" + sBuffer);
	}
}
