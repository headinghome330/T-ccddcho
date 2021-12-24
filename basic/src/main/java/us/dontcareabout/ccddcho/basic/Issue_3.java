package us.dontcareabout.ccddcho.basic;

public class Issue_3 {

	public static void main(String[] args) {
		// Armstrong 數：一個三位數的正整數，假設百位數為 a、十位數為 b、個位數為 c，則滿足 a^3 + b^3 + c^3 = a*100 + b*10 + c 為 Armstrong 數。
		int a = 1, b = 0, c = 0;

		for (c = 0; c <= 9; c++) {
			for (b = 0; b <= 9; b++) {
				for (a = 1; a <= 9; a++) {
					int k = a * a * a + b * b * b + c * c * c; // >=100 & <1000
					int m = a * 100 + b * 10 + c;
					if (k == m) {
						System.out.println(m);
					} else
						continue;
				}

			}

		}

	}

}
