package us.dontcareabout.ccddcho.basic;

//假設有一個數列 A 共有 n 個元素，且均為正整數。headSum(x) 為前面（A1～Ax）元素的總和，tailSum(y) 為後面（Ay～An）元素的總和。請求出該數列中 headSum() 與 tailSum() 相同的數字。
//注意：上面是偏數學的寫法，所以 index 起始值是 1。（Java 陣列的起始值是 0）

public class Issue_11 {

	public static void main(String[] args) {

		int[] A = { 3, 6, 2, 1, 4, 4, 2, 1 };
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
}
