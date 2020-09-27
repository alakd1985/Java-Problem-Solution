package Generics;

class Store<T> implements Container<T>{
	private T a;
	
	public void set(T a) {
		this.a = a;
	}
	
	public T get() {
		return a;
	}
}

