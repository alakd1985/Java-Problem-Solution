package thisKey;

//Using �this� keyword to invoke current class method
public class test5 {
	int a, b;

	public test5() {
		a = 200;
		b = 900;
	}

	void display() {
		System.out.println("This is a display method");
	}

	void show() {
		this.display();
		System.out.println("This is a show method");
	}

	public static void main(String[] args) {
		test5 ss = new test5();
		ss.display();
		ss.show();
	}
}
