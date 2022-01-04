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
	 * @param v 傳入數字
	 * @param p 次方整數
	 * @return v^p 數值
	 */
	public static double cubed(int v, int p) {
		double Cubed = 1;
		boolean b;
		
		for (int j = 1; b = (p >= 0) ? (j <= p) : (j <= -p); j++) {
			if (j == 1 && p == 0) {
				Cubed = 1;
			} else if (b == (j <= p)) {
				Cubed *= v;
			} else if (b == (j >= p)) {
				Cubed /= v;
			}
		}

		return Cubed;
	}

	public static void main(String[] args) {
		// Armstrong 數：一個三位數的正整數，假設百位數為 a、十位數為 b、個位數為 c，則滿足 a^3 + b^3 + c^3 = a*100 + b*10 + c 為 Armstrong 數。
		
		System.out.println("method 1");

		for (int c = 0; c <= 9; c++) {
			for (int b = 0; b <= 9; b++) {
				for (int a = 1; a <= 9; a++) {
					double k = cubed(a, 3) + cubed(b, 3) + cubed(c, 3);
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
			double k = cubed(hundred, 3) + cubed(ten, 3) + cubed(each, 3);
			if (k == m) {
				System.out.println(m);
			}
		}

	}
}
