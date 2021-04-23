package javaPracticeProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepetativeCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:  ");
		String str = scanner.nextLine();
		char[] c = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character d : c) {
			if (map.containsKey(d)) {
				map.put(d, map.get(d) + 1);
			} else {
				map.put(d, 1);
			}
		}

		for (Character d : map.keySet()) {
			if (map.get(d) > 1) {
				System.out.println("Chracter " + d + " is repeated " + map.get(d) + " times ");
			}
		}
	}

}
