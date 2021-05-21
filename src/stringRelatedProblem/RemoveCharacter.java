package stringRelatedProblem;

public class RemoveCharacter {

	public static void main(String[] args) {
		String str = "abcdefabcdeabcdaaa";
		System.out.println("Original string:\n" + str);
		char c = 'a';
		String s = removeString(str, c);
		System.out.println("After removing the string::: " + s);
	}

	public static String removeString(String rem, char z) {
		String newString = "";
		for (int i = 0; i < rem.length(); i++) {
			if (rem.charAt(i) != z) {
				newString += rem.charAt(i);
			}
		}
		return newString;
	}
}
