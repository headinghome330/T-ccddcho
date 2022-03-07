package us.dontcareabout.ccddcho.basic.Issue_15;

import java.util.ArrayList;
import java.util.Arrays;

public class Fib1 {

	ArrayList<Integer> list = new ArrayList<>();

	public Fib1(int a0, int a1) {
		list = new ArrayList<>(Arrays.asList(a0, a1));
	}

	public int fibonacci(int n) {

		if (n == 0) {
			return list.get(n);
		}
		
		if (n >= list.size()) {

			for (int i = list.size(); i <= n; i++) {
				Integer result ;
				result = list.get(i - 2) + list.get(i - 1);
				list.add(i, result);
			}

		}

		return list.get(list.size() - 1);
	}
}