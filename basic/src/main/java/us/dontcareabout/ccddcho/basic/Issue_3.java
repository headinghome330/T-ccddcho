package us.dontcareabout.ccddcho.basic;

public class Issue_3 {

	/**
	 * @param v 底數
	 * @param p 次方數
	 * @return v^p 數值
	 */
	public static double power(int v, int p) {
		double power = 1;

		for (int j = 0; j < abs(p); j++) {
			if (p != 0) {
				power = (p > 0) ? power * v : power / v;
			}
		}

		return power;
	}

	public static int abs(int a) {
		return (a < 0) ? -a : a;
	}

	public static void armstrong(int t) {
		double f = power(10, t);

		for (int k = (int) power(10, t - 1); k < f; k++) {
			double m = 0;
			for (int p = 0; p < t; p++) {
				m += power(digit(k, p), t);
			}
			if (k == m) {
				System.out.println(k);
			}
		}
	}

	public static void main(String[] args) {
		armstrong(3);
	}

	public static int digit(int k, int p) {
		return (int) ((k / power(10, p)) % 10);
	}

}
