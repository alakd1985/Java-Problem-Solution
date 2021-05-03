package javaPracticeProblem;

import java.util.ArrayList;
import java.util.List;

public class EvenOddTogether {
	public static void main(String[] args) {
		int nums[] = { 20, 12, 23, 17, 7, 8, 10, 2, 1, 0 };
		List<Integer> even = new ArrayList();
		List<Integer> odd = new ArrayList();
		for (int i : nums) {
			if (i % 2 == 0) {
				even.add(i);
			} else {
				odd.add(i);
			}
		}
		List<Integer> newList = new ArrayList();
		newList.addAll(even);
		newList.addAll(odd);
		System.out.println(newList);
	}
}
