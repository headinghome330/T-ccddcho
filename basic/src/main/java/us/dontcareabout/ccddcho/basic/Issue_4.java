package us.dontcareabout.ccddcho.basic;

public class Issue_4 {

	public static void main(String[] args) {
		int n = 5;
		int i = 0;
		int j = 0;

		System.out.println("for loop 金字塔");

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = n - 2; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
