package us.dontcareabout.ccddcho.basic;

public class IssueM24 {
	private static final char p = '+';
	private static final char n = '-';
	private static final char m = '*';
	private static final char d = '/';

	private static final char[] p_n = new char[] {p, n};
	private static final char[] m_d = new char[] {m, d};

	private static final int left = -1;
	private static final int right = 1;

	private static final int char0 = 48;
	private static final int char9 = 57;

	/**
	 * @return 把 source 的 leftBound～rightBound 替換成 replaceNum 字串化後的 char
	 */
	private static char[] combine(char[] source, int leftBound, int rightBound, int replaceNum) {
		char[] replaceCharArray = ("" + replaceNum).toCharArray();
		char[] result = new char[source.length + replaceCharArray.length - rightBound + leftBound - 1];

		for (int i = 0; i < leftBound; i++) {
			result[i] = source[i];
		}

		for (int i = 0; i < replaceCharArray.length; i++) {
			result[leftBound + i] = replaceCharArray[i];
		}

		for (int i = 1; i < source.length - rightBound; i++) {
			result[leftBound + replaceCharArray.length + i - 1] = source[rightBound + i];
		}

		return result;
	}

	private static int findMorD(char[] string) {
		return find(string, m_d);
	}

	private static int findPorN(char[] string) {
		return find(string, p_n);
	}

	/**
	 * @return target 任一 element 在 string 中第一次出現的位置。
	 * 	找不到回傳 -1
	 */
	private static int find(char[] string, char[] target) {
		for (int i = 0; i < string.length; i++) {
			for (int i2 = 0; i2 < target.length; i2++) {
				if (string[i] == target[i2]) {
					return i;
				}
			}
		}

		return -1;
	}

	private static int getNumBound(char[] string, int opIndex, int direction) {
		//opIndex 一定不符合條件，所以先加一次 direction
		int i = opIndex + direction;
		for (; i >= 0 && i < string.length; i += direction) {
			if (string[i] > char9 || string[i] < char0) {
				return i - direction;
			}
		}

		//會到這來就表示找到底 or 找到頭了，所以一樣往回一格
		return i - direction;
	}

	private static int toNumber(char[] string) {
		return toNumber(string, 0, string.length - 1);
	}

	private static int toNumber(char[] string, int bound1, int bound2) {
		int min = Math.min(bound1, bound2);
		int max = Math.max(bound1, bound2);
		int result = 0;

		for (int i = 0; i <= max - min; i++) {
			result += (string[max - i] - char0) * Math.pow(10, i);
		}

		return result;
	}
}
