package javaPracticeProblem;

public class ContainingString {

	public static void main(String[] args) {
		String str = "Java is the foundation for virtually every type of networked application"
				+ " and is the global standard for developing and  delivering embedded and mobile "
				+ "applications, games, Web-based content,  and enterprise software. With more than 9 million "
				+ "developers worldwide, Java enables you to efficiently develop, "
				+ "deploy and use exciting applications and services.";

		String p1 = "million";
		String p2 = "millions";
		System.out.println("The first one is " + contain(str, p1));
		System.out.println("The first second is " + contain(str, p2));
	}

	public static boolean contain(String s1, String s2) {
		for (int i = s2.length(); i < s1.length(); i++) {
			if (s1.substring(s2.length(), i).contains(s2)) {
				return true;
			}
		}
		return false;
	}
}
