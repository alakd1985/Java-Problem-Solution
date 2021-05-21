package stringRelatedProblem;

public class RightRotateStringBythreeElement {

	public static void main(String[] args) {
		String line = "Alakkanti";
		char[] ca = line.toCharArray();
		for (int j = 1; j < 3; j++) {
			char last = ca[ca.length - 1];
			for (int i = ca.length - 1; i > 0; i--) {
				ca[i] = ca[i - 1];
			}
			ca[0] = last;
		}
		StringBuffer sBuffer = new StringBuffer();
		for (char x : ca) {
			sBuffer.append(x);
		}

		System.out.println("After the rotation the number is ::" + sBuffer);

	}

}
