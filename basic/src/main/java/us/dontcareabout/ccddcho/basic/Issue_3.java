package us.dontcareabout.ccddcho.basic;

public class Issue_3 {

	/**
	 * @param a 百位數字
	 * @param b 十位數字
	 * @param c 個位數字
	 * @return 傳回值為 a 的三次方 + b 的三次方 + c 的三次方
	 */
	public static double threeCubedAndPlus(double a, double b, double c) {
		return Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
	}

	/**
	 * @param v 底數
	 * @param p 次方數
	 * @return v^p 數值
	 */
	public static double power(int v, int p) {
		double power = 1;
		for (int j = 1; j <= abs(p); j++) {

			if (p >= 0) {
				if (j == 1 && p == 0) {
					power = 1;
				} else {
					power *= v;
				}
			} else if (p < 0)
				power /= v;
		}

		return power;
	}

	public static int abs(int a) {
		return (a < 0) ? -a : a;
	}

	public static void main(String[] args) {
		// Armstrong 數：一個三位數的正整數，假設百位數為 a、十位數為 b、個位數為 c，則滿足 a^3 + b^3 + c^3 = a*100 + b*10 + c 為 Armstrong 數。
		System.out.println(power(52, -2));

		System.out.println("method 1");

		for (int c = 0; c <= 9; c++) {
			for (int b = 0; b <= 9; b++) {
				for (int a = 1; a <= 9; a++) {
					double k = power(a, 3) + power(b, 3) + power(c, 3);
					int m = a * 100 + b * 10 + c;
					if (k == m) {
						System.out.println(m);
					}
				}
			}
		}

		System.out.println("method 2");

		for (int m = 100; m < 1000; m++) {
			int hundred = m / 100;
			int ten = m % 100 / 10;
			int each = m % 100 % 10;
			double k = power(hundred, 3) + power(ten, 3) + power(each, 3);
			if (k == m) {
				System.out.println(m);
			}
		}

	}
}
