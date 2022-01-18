package us.dontcareabout.ccddcho.basic;

public class IssueM24 {
	private static final char p = '+';
	private static final char n = '-';
	private static final char m = '*';
	private static final char d = '/';

	private static final char[] p_n = new char[] {p, n};
	private static final char[] m_d = new char[] {m, d};

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
}
