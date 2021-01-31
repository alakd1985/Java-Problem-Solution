package aggregation;

public class Employee {
	String joblocation, jobtitile;
	Address address;

	public Employee(String joblocation, String jobtitile, Address address) {
		this.joblocation = joblocation;
		this.jobtitile = jobtitile;
		this.address = address;
	}

	void display() {
		System.out.println("Joblocation is :" + joblocation + "jobtitile is :" + jobtitile);
		System.out.println(address.department + "" + address.id + "" + address.name);
	}
}
