package Generics;



public class GenericClassExample<T> {

	T ob;
	
	public GenericClassExample(T ob) {
		this.ob = ob;
	}
	
	public void show() {
		System.out.println("The type of object is :: "+ob.getClass());
	}
	
	public T get() {
		return this.ob;
	}
}
