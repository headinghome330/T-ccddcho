package us.dontcareabout.ccddcho.basic.Issue_15;

/**
 * 因為在原本的版本 L30、L31 不需要寫，每次的傳入都會 initial
 *
 */
public class Fib1 {

	private final int a0;
	private final int a1;

	public Fib1(int a0, int a1) {
		this.a0 = a0;
		this.a1 = a1;
	}

	public int fibonacci(int n) {
		int result = 0;
		int v1 = a0;
		int v2 = a1;
		
		
		if (n == 0) {
			return v1;
		} else if (n == 1) {
			return v2;
		} else {
			for (int i = 2; i <= n; i++) {
				result = v1 + v2;
				v1 = v2;
				v2 = result;
			}
			return result;
		}

	}
}
