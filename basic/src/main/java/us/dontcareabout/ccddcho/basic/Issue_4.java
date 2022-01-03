package us.dontcareabout.ccddcho.basic;

public class Issue_4 {

	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		System.out.println("for loop 金字塔");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%s", "*");

			}
			System.out.printf("%n");
		}

		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%s", "*");
			}
			System.out.printf("%n");
		}

		System.out.println("for loop 金字塔");

		for (int i = 1; i <= n && i > 0; i = (i == n) ? --n & --i : ++i) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("for loop 金字塔");

		for (int i = 1; i <= m & m > 0; i = (i == m) ? i : ++i) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
			if (i == m) {
				i--;
				m--;
			}
		}

	}
}
