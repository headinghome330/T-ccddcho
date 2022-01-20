package us.dontcareabout.ccddcho.basic.Issue_15;

public class Fib1 {

	private int a0;
	private int a1;

	public Fib1(int a0, int a1) {
		this.a0 = a0;
		this.a1 = a1;
	}

	public int fibonacci(int n) {
		int result = 0;
		int first  = a0;
		int second = a1;

		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				result = first;
			} else if (i == 1) {
				result = second;
			} else {
				result = a0 + a1;
				a0 = a1;
				a1 = result;
			}
		}

		a0 = first;
		a1 = second;
		return result;
	}
}
