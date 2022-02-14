package us.dontcareabout.ccddcho.basic;

public class Issue_24 {

	public static void main(String[] args) {
		System.out.println(calculate("1+2*3-4"));// 印出 3
		System.out.println(calculate("5*5*5")); // 印出 125
		System.out.println(calculate("1+28*13*22-4"));
		System.out.println(calculate("1+28*130*22-4*96*7-6"));
		System.out.println(calculate("1+28*130*22-5*5*5"));
	}

	/**
	 * @param k int陣列中'*'的位置
	 * @return 計算字串的operator皆為'*'時，將其計算後轉換為新陣列
	 */
	private static int[] transformSingleOperator(int[] a, int k) {
		for (int i = k; i < a.length; i += 2) {
			a[k - 1] *= a[i + 1];
			a[i + 1] = 0;
			a[i] = '+';
		}

		return a;
	}

	/**
	 * @return int陣列中operator的個數
	 */
	private static int operatorSize(int[] a) {
		int m = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == '*') {
				m++;
			}
		}

		return m;
	}

	/**
	 * @param k int陣列中'*'的位置
	 * @return int陣列中有'*'、+'、'-'等多種operator時，將其計算後轉換為新陣列
	 */
	private static int[] transformMultiOperator(int[] a, int k) {
		int m = a.length;
		for (int i = k; i < m; i += 2) {
			if (a[i] != '*') {
				for (int i1 = k; i1 < i; i1 += 2) {
					a[k - 1] *= a[i1 + 1];
					a[i1 + 1] = 0;
					a[i1] = '+';
				}
				m = i;
			}

			if ((a.length - k) / 2 == operatorSize(a, k)) {
				for (int i2 = k; i2 < a.length; i2 += 2) {
					a[k - 1] *= a[i2 + 1];
					a[i2 + 1] = 0;
					a[i2] = '+';
				}
				i = m;
			}

		}

		return a;
	}

	/**
	 * @param k int陣列中'*'的位置
	 * @return int陣列中'*'為最後一種類的operator時，計算k位置開始到最後共有幾個'*' 
	 */
	private static int operatorSize(int[] a, int k) {
		int m = 0;

		for (int i = k; i < a.length; i++) {
			if (a[i] == '*') {
				m++;
			}
		}

		return m;
	}

	/**
	 * @param k int陣列中的'*'位置
	 * @return 將int陣列計算並轉換後的新int陣列
	 */
	private static int[] transformOperator(int[] a, int k) {
		if (a.length / 2 == operatorSize(a)) {
			a = transformSingleOperator(a, k);
		} else {
			a = transformMultiOperator(a, k);
		}

		return a;
	}

	public static int calculate(String string) {
		int[] a = transform(string.toCharArray());
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '*') {
				a = transformOperator(a, i);
			}
		}

		int m = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] == '+') {
				m += a[i + 1];
			}

			if (a[i] == '-') {
				m -= a[i + 1];
			}
		}

		return m;
	}

	/**
	 * @return 依照operand及operator，將char陣列轉換為int陣列
	 */
	private static int[] transform(char[] c) {
		int operand;
		int operandLength;
		int operandIndexOfA = 0;
		int operandOrder = 0;

		int[] a = new int[size(c)];
		a = addOperatorIndex(a, c);

		for (int i = operandOrder; i < c.length; i++) {

			if (c[i] < '0' || c[i] > '9') {
				operandLength = i - operandOrder;
				operand = calOperand(c, i, operandLength, operandOrder);
				if (a[operandIndexOfA] == 0) {
					a[operandIndexOfA] = operand;
					operandIndexOfA = (operandIndexOfA == a.length - 1 ? operandIndexOfA : operandIndexOfA + 2);
				}
				operandOrder = i + 1;
			}

			if (i == lastOperatorIndex(c)) {
				operandLength = (c.length - 1) - i;
				operand = calOperand(c, c.length, operandLength, i + 1);
				a[a.length - 1] = operand;
			}
		}

		return a;
	}

	/**
	 * @param c	字元陣列
	 * @param indexOperator 字元陣列中某位置的operator
	 * @param digit operand的位數
	 * @param orderOperand 字元陣列中某operand的第一個數字
	 * @return
	 */
	private static int calOperand(char[] c, int indexOperator, int digit, int orderOperand) {
		int value = 0;
		int intOperand = 0;

		for (int i = orderOperand; i < indexOperator; i++) {
			if (c[i] >= '0' || c[i] <= '9') {
				intOperand = c[i] - '0';
			}
			if (digit - 1 >= 0) {
				value += intOperand * (int) Math.pow(10, digit - 1);
				digit--;
			}
		}

		return value;

	}

	/**
	 * @return 最後一個operator的位置
	 */
	private static int lastOperatorIndex(char[] c) {
		int k = 0;

		for (int i = 0; i < c.length; i++) {
			if (c[i] < '0' || c[i] > '9') {
				k = i;
			}
		}

		return k;
	}

	/**
	 * @return 將c陣列轉換為int陣列後的長度
	 */
	private static int size(char[] c) {
		int k = 0;

		for (int s = 0; s < c.length; s++) {
			if (c[s] < '0' || c[s] > '9') {
				k++;
			}
		}

		return k + (k + 1);
	}

	/**
	 * @return 將char陣列的operator加入到int陣列中的相對位置
	 */
	private static int[] addOperatorIndex(int[] a, char[] c) {
		int indexOfA = 1;
		int indexOperator = 0;

		for (int i = indexOperator; i < c.length; i++) {
			if (c[i] < '0' || c[i] > '9') {
				a[indexOfA] = c[i];
				indexOfA += 2;
			}
		}

		return a;
	}

}
