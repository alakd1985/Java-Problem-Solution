package constructor;

// example of overloaded constructor
public class Animal {
	String a, b;
	int c, d;

	/*
	 * public Animal(String a, String b) { this.a = a; this.b = b; }
	 * 
	 * public Animal(String a, String b, int c, int d) { this.a = a; this.b = b;
	 * this.c = c; this.d = d; }
	 */

	void display() {
		System.out.println("The name of the animal are::" + a + b);
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		// Animal a1 = new Animal("dog", "cat", 12, 34);
		a.display();

	}

}
