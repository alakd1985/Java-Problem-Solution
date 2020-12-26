package thisKey;

// Using ‘this’ keyword to refer current class instance variables
public class test1 {
// the following are instance variable
	int a, b;
	String c;

	public test1(int a, int b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void display() {
		// Displaying value of variables a and b
		System.out.println("a = " + a + "  b = " + b + " c =" + c);
	}

	public static void main(String[] args) {
		test1 s = new test1(10, 20, "name");
		s.display();
		test1 s1 = new test1(100, 200, "name1");
		s1.display();
	}
}
