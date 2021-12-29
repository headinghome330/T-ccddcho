package us.dontcareabout.ccddcho.basic;

public class Issue_4 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("for loop 金字塔");

		for (int i = 1; i <= n && i > 0; i = (i == n) ? --i & --n : ++i) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
