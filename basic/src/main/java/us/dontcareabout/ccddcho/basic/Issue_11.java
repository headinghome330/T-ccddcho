package us.dontcareabout.ccddcho.basic;

//假設有一個數列 A 共有 n 個元素，且均為正整數。headSum(x) 為前面（A1～Ax）元素的總和，tailSum(y) 為後面（Ay～An）元素的總和。請求出該數列中 headSum() 與 tailSum() 相同的數字。
//注意：上面是偏數學的寫法，所以 index 起始值是 1。（Java 陣列的起始值是 0）

public class Issue_11 {

	public static void main(String[] args) {

		int[] A = { 3, 6, 2, 1, 4, 4, 2, 1 };
		version1(A);
		System.out.println();
		version2(A);
		System.out.println();
		version3(A);

	}

	public static void version3(int[] A) {
		int headSum = 0;
		int tailSum = 0;

		for (int i = 0, j = A.length - 1; i <= A.length - 1 && j <= A.length - 1 && j >= 0; j--) {

			headSum = headSum(i, A);
			tailSum = tailSum(j, A);
			if (headSum == tailSum) {
				System.out.println(headSum);
			}
			if (j == 0) {
				tailSum = tailSum(j, A);
				j = A.length - 1;
				i++;
			}
		}

	}

	public static void version2(int[] A) {
		int headSum = 0;
		int tailSum = 0;

		for (int i = 0; i < A.length; i++) {
			headSum += A[i];
			for (int j = A.length - 1; j < A.length && j >= 0; j--) {
				tailSum += A[j];
				if (headSum == tailSum) {
					System.out.println(headSum);
				}
			}
			tailSum = 0;
		}

	}

	public static void version1(int[] A) {
		int tailSum = 0;

		for (int i = 1; i <= A.length; i++) {
			for (int j = 0; j <= A.length; j++) {
				if (headSum(i - 1, A) == tailSum(j, A)) {
					System.out.println(tailSum(j, A));
					tailSum = tailSum(j, A);
				}
			}
		}

	}

	public static int headSum(int x, int[] A) {
		int sum = 0;

		for (int i = 0; i <= x; i++) {
			sum += A[i];
		}

		return sum;
	}

	public static int tailSum(int y, int[] A) {
		int sum = 0;

		for (int i = y; i <= A.length - 1; i++) {
			sum += A[i];
		}

		return sum;
	}

}
