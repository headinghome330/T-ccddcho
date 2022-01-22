package us.dontcareabout.ccddcho.basic.Issue_15;

/**
 * 1.因為在原本版本的 L30、L31 不需要寫，每次傳進去都會指定 v1 = a0 , v2 = a1
 * 2.在迴圈內做 if else 條件判斷，n >= 2才需要用到迴圈條件
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
		}
		if (n == 1) {
			return v2;
		}

		for (int i = 2; i <= n; i++) {
			result = v1 + v2;
			v1 = v2;
			v2 = result;
		}

		return result;
	}

}
