package thisKey;

//Java code for using 'this' keyword  
//to return the current class instance 
public class test3 {
	int a, b;

	public test3() {
		a = 10;
		b = 200;
	}

	// Method that returns current class instance
	test3 get() {
		return this;
	}

	// Displaying value of variables a and b
	void display() {
		System.out.println("a = " + a + "  b = " + b);
	}

	public static void main(String[] args) {
		new test3().get().display();
	}
}
