package javaPracticeProblem;

public class ContainsDigit {

	public static void main(String[] args) {
		String str1 = "131231231231231231231231231212312312";
		System.out.println("First string:\n" + str1);
		System.out.println(check(str1));

		String str2 = "13123123123Z1231231231231231212312312";
		System.out.println("\nSecond string:\n" + str2);
		System.out.println(check(str2));

	}

	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) >= 0 && (s.charAt(i)) <= 9)) {
				return false;
			}
		}
		return true;
	}

}
