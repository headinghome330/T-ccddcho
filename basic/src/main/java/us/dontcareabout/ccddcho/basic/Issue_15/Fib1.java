package us.dontcareabout.ccddcho.basic.Issue_15;

import java.util.ArrayList;

public class Fib1 {

	ArrayList<Integer> list;

	public Fib1(int a0, int a1) {
		list = new ArrayList<>();
		list.add(a0);
		list.add(a1);
	}

	public int fibonacci(int n) {

		if (n < list.size()) {
			return list.get(n);
		}

		for (int i = list.size(); i <= n; i++) {
			list.add(list.get(i - 2) + list.get(i - 1));
		}

		return list.get(list.size() - 1);

	}
}