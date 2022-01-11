package us.dontcareabout.ccddcho.basic;

public class Issue_7 {

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

	public static void armstrong(int l) {
		
		for (int k = (int) power(10, l - 1); k < power(10, l); k++) {
			double m = power((int) (k / power(10, l - 1)), l);
			int temp = k;
			for (int p = l - 1; p > 0; p--) {
				int remainder = (int) (temp % power(10, p));
				temp = remainder;
				int quotient = (int) (remainder / power(10, p - 1));
				m += power(quotient, l);
			}

			if (k == m) {
				System.out.println(k);
			}
		}
	}

	public static void main(String[] args) {
		armstrong(7);
	}
}
