package aggregation;

public class AggregationTest {

	public static void main(String[] args) {
		Address a1 = new Address(12, "alak", "computer science");
		Address a2 = new Address(14, "alak1", "computer science1");
		Employee e1 = new Employee("cv", "vc", a1);
		e1.display();
	}

}
