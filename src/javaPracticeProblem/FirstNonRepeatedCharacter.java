package javaPracticeProblem;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word:: ");
		String line = scanner.nextLine().toLowerCase();
		boolean status = false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (map.get(c) == 1) {
				System.out.println("The first non repeated character is:: " + c);
				break;
			}
		}
		if (!status) {
			System.out.println("There is no unique character");
		}
	}
}
