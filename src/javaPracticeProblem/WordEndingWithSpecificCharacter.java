package javaPracticeProblem;

public class WordEndingWithSpecificCharacter {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter a new line"); String w =
		 * scanner.nextLine().toLowerCase();
		 * System.out.println("Enter a word to search:: "); String sw =
		 * scanner.nextLine().toLowerCase();
		 */
		String a = "GeeksForGeeks is a computer" + " science portal for geeks";
		String b = "ks";

		System.out.print(endsWithSpecificCharacter(a, b));

	}

	public static int endsWithSpecificCharacter(String str, String suff) {

		/*
		 * int count = 0; String[] s = str.split(""); for (int i = 0; i < str.length();
		 * i++) { if (s[i].endsWith(suff)) { count++; } } return count;
		 */

		// To store the count

		int cnt = 0;

		// Extract words from the sentence
		String words[] = str.split(" ");

		// For every word
		for (int i = 0; i < words.length; i++) {

			// If it ends with the given suffix
			if (words[i].endsWith(suff))
				cnt++;
		}

		return cnt;

	}

}
