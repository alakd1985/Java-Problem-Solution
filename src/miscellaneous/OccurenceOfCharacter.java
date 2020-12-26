package miscellaneous;

import java.util.Scanner;

public class OccurenceOfCharacter {

	public static void main(String[] args) {

		System.out.println("Enter the sentence:  ");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();

		int totalcount = line.length();
		int replacecount = line.replace("a".toLowerCase(), "").length();
		int count = totalcount - replacecount;

		System.out.println("The number of occurance of ::" + count);

	}

}
