package thisKey;

public class test2 {
	// Java code for using this() to
	// invoke current class constructor
	int a, b;

	// Default constructor
	test2() {
		this(10, 20);
		System.out.println("This is a non parametrized constructor");
	}

	// Parameterized constructor
	test2(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("This is a parametirized constructor");
	}

	public static void main(String[] args) {
		test2 s = new test2();
	}

}
