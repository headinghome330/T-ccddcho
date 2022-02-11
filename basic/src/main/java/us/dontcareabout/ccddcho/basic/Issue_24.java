package us.dontcareabout.ccddcho.basic;

public class Issue_24 {

	public static void main(String[] args) {
		System.out.println(calculate("1+2*3-4")); // 印出 3
	}

	public static int calculate(String string) {
		char[] c = string.toCharArray();
		int[] a = transform(c);
		int m = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] == (int) ('*')) {
				a[i - 1] = a[i - 1] * a[i + 1];
				a[i + 1] = 0;
				a[i] = (int) ('+');
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == (int) ('+')) {
				m += a[i + 1];
			}

			if (a[i] == (int) ('-')) {
				m -= a[i + 1];
			}
		}
		return m;
	}

	public static int[] transform(char[] c) {
		int[] a = new int[c.length];

		for (int i = 0; i < c.length; i++) {

			if (c[i] >= (int) ('0') && c[i] <= (int) ('9')) {
				a[i] = (c[i] - '0');
			}

			if (c[i] == (int) ('+') || c[i] == (int) ('*') || c[i] == (int) ('-')) {
				a[i] = c[i];
			}

		}

		return a;
	}
}
