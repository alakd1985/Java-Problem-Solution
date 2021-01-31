package constructor;

// example of parametarized constructor
public class student {

	int a;
	String b;

	public student(int a, String b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println("The value of a is:: " + a + "and b is:: " + b);
	}

	public static void main(String[] args) {
		student s = new student(100, "df");
		student s1 = new student(123, "ggg");
		s.display();
	}

}
