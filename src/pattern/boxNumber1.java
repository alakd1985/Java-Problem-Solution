package pattern;

public class boxNumber1 {
	/*
	 * AAAAA BBBBB CCCCC DDDDD EEEEE
	 */
	public static void main(String[] args) {
		char i, j;

		for (i = 65; i <= 69; i++) {
			for (j = 65; j <= 69; j++) {
				System.out.print("" + (char) i);
			}
			System.out.println("");
		}

	}

}
