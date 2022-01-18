package us.dontcareabout.ccddcho.basic.Issue_15;

public class Fib1 {

	private int s;
	private int f;

	public Fib1(int s, int f) {
		this.s = s;
		this.f = f;
	}

	public int fibonacci(int d) {
		int result = 0;
		
		for (int i = 2; i <= d; i++) {
			result = s + f;
			s = f;
			f = result;
		}

		return result;
	}
}
