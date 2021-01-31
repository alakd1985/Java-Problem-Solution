package constructor;

// example of constructor chaining
public class parent {
	String name, address;
	int phonenum, zip;

	public Animal animal;

	public parent() {
		this("Alak", "duke st");
		System.out.println("This is a default constructor");
		System.out.println("The values are::" + name + " " + address + " " + +phonenum + " " + +zip);
	}

	parent(String name, String address) {
		this(9998888, 23456);
		this.name = name;
		this.address = address;
	}

	parent(int phonenum, int zip) {
		this.phonenum = phonenum;
		this.zip = zip;
	}

	public static void main(String[] args) {
		new parent();

	}
}
