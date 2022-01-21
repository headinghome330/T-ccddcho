package us.dontcareabout.ccddcho.basic.Issue_13;

/**
 * 目前的版本修改了原本多一個 index 的部分，當 push() 時同時在兩個 stack 上增加數字，分別是 stack[] 及 temp[]
 * stack[] 依然保有完整的 push() 紀錄，而 temp() 則是隨著 pop() 而去 remove() 內容 保有 stack[]
 * push() 紀錄的好處就是，可以在之後繼續使用 stack[] 內的紀錄
 * 
 * p.s. 關於 Must FIX 有要求，「pop() 的時候不用清除來改寫 Stack」，但不確定這種方式有沒有符合。
 */
public class Stack {

	private int[] result = new int[0];

	public int pop() {
		int topV = result[result.length - 1];

		for (int i0 = result.length - 1; i0 > 0; i0--) {
			result[i0] = result[i0 - 1];
			result[0] = topV;
		}

		return topV;
	}

	public void push(int k) {
		result = add(k, result);
	}

	private static int[] add(int k, int[] a) {
		int[] lastResult = a;
		a = new int[a.length + 1];
		a[a.length - 1] = k;

		if (a.length != 0) {
			for (int i1 = lastResult.length - 1; i1 >= 0; i1--) {
				a[i1] = lastResult[i1];
			}
		}

		return a;
	}
}
