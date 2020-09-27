package Generics;

public class UseGenericClass {

	public static void main(String[] args) {
		GenericClassExample<Integer> obj = new GenericClassExample<Integer>(10);
		obj.show();

		GenericClassExample<String> obj1 = new GenericClassExample<String>("Alak");
		obj1.show();

	}

}
