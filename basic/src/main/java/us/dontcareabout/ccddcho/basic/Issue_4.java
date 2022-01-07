package us.dontcareabout.ccddcho.basic;

public class Issue_4 {

	public static void main(String[] args) {
		int n = 5;

		System.out.println("for loop 金字塔 1");

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

		System.out.println("for loop 金字塔 2");

		for (int i = 1; i <= n && i > 0; i = (i == n) ? --n & --i : ++i) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		n = 5;
		System.out.println("for loop 金字塔 3");

		for (int i = 1, j = n - 1; i <= n && j >= 0; i = (i == n) ? --n : ++i) {
			String A = "*";
			System.out.println(A.repeat(i));
			if (i == n) {
				j--;
			}
		}

		n = 5;
		System.out.println("解決醜迴圈但還是偷偷用repeat的 for loop 金字塔 4");

		for (int i = 1, j = n - 1; i <= n && j >= 0; j--) {
			String A = "*";

			System.out.println(A.repeat(i));

			if (i == n) {
				--n;
				--i;
				if (j == 0) {
					j = n;
				}
			} else if (i < n) {
				i++;
			}

		}

		n = 5;
		System.out.println("🤯 for loop 金字塔 5");
		String A = "*";

		for (int i = 1, j = n - 1; i <= n && j >= 0; j--) {

			System.out.println(A);

			if (i == n) {
				--n;
				--i;
				j = n;
				A = "";
				if (j == n) {
					for (j = n - 1; j >= 0; j--) {
						A += "*";
					}
				}
				j = n;
			} else if (i < n) {
				i++;
				A += "*";
			}

		}
		System.out.println();

		n = 5;
		System.out.println("for loop 金字塔 6");

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("The 湊 版本 🤯 for loop 金字塔 7");
		n = 6;
		int m = n;
		
		for (int i = n; i >= n; i = (i * n <= 1) ? ++i : --i, --n) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if ((i * n / m) < 0 && i / m == 1) {
				break;
			}
		}
		
	}

}
