package us.dontcareabout.ccddcho.basic;

public class Issue_3 {
	/**
	 * <p>
	 * Armstrong 數：一個三位數的正整數，假設百位數為 a、十位數為 b、個位數為 c，則滿足 a^3 + b^3 + c^3 = a*100 +
	 * b*10 + c 為 Armstrong 數。
	 * 
	 * @param a 個位數字
	 * @param b 十位數字
	 * @param a 百位數字
	 * 
	 */
	public static void armstrong() {

		for (int c = 0; c <= 9; c++) // c loop
			for (int b = 0; b <= 9; b++) // b loop
				for (int a = 1; a <= 9; a++) { // a loop
					int m = a * 100 + b * 10 + c;
					double k = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3); // >=100 & <1000
					if (k == m)
						System.out.println(m);
					else
						continue;
				}

	}

	public static void main(String[] args) {
		armstrong();
	}
}
