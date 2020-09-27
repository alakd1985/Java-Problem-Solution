package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class home {

	public static void main(String[] args) {
		test t = new test();
		Class classzz = t.getClass();
		String name = classzz.getSimpleName();
		System.out.println(name);
		Constructor[] cons=classzz.getDeclaredConstructors();
		System.out.println("The length of the constructor is :: "+ cons.length);

		Method[] mclass = classzz.getDeclaredMethods();

		// total number of methods
		//System.out.println("the total number of methods are:: " + mclass.length);

		for (Method method : mclass) {
			System.out.println("The name of the methods are:: " + method.getName() + "The return type is :: "
					+ method.getReturnType());

			Parameter[] pm = method.getParameters();

			for (Parameter para : pm) {

				System.out.println("The name of the parameters are:: " + para.getName());
			}

		}
	}

}
