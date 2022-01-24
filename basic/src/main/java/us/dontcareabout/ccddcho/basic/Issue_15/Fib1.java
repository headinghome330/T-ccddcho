package us.dontcareabout.ccddcho.basic.Issue_15;

/**
 * 1.不應該使用 field 在迴圈內運算，使用 local vaiable 就可以避免多餘程式碼
 * 2.在迴圈內做 if else 條件判斷，n >= 2 才需要用到迴圈條件
 */
public class Fib1 {

	private final int a0;
	private final int a1;

	public Fib1(int a0, int a1) {
		this.a0 = a0;
		this.a1 = a1;
	}

	public int fibonacci(int n) {

		if (n == 0) {
			return a0;
		}

		if (n == 1) {
			return a1;
		}
		
		return calFibonacci(a0, a1, n);
	}

	private static int calFibonacci(int v1, int v2, int n) {
		int result = 0;

		for (int i = 2; i <= n; i++) {
			result = v1 + v2;
			v1 = v2;
			v2 = result;
		}

		return result;
	}

}
