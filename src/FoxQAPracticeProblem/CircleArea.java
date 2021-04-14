package FoxQAPracticeProblem;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a radius value::  ");
		double radius = scanner.nextDouble();
		System.out.println("The area of the circle is : " + Math.PI * radius * radius);
	}

}
