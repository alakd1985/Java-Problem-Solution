package thisKey;
// Using ‘this’ keyword as method parameter

//Java code for using 'this'  
//keyword as method parameter 
public class test4 {
	int a, b;

	public test4() {
		a = 100;
		b = 200;
	}

	// Method that receives 'this' keyword as parameter
	void display(test4 obj) {
		System.out.println("a is::" + a + "b is::" + b);
	}

	// Method that returns current class instance
	void get() {
		display(this);
	}

	public static void main(String[] args) {
		test4 s = new test4();
		s.get();
	}
}
