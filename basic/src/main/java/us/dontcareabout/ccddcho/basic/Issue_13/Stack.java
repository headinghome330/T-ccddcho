package us.dontcareabout.ccddcho.basic.Issue_13;

import java.util.Arrays;

/**
 * 目前的版本修改了原本多一個 index 的部分，當 push() 時同時在兩個 stack 上增加數字，分別是 stack[] 及 temp[]
 * stack[] 依然保有完整的 push() 紀錄，而 temp() 則是隨著 pop() 而去 remove() 內容 保有 stack[]
 * push() 紀錄的好處就是，可以在之後繼續使用 stack[] 內的紀錄
 * 
 * p.s. 關於 Must FIX 有要求，「pop() 的時候不用清除來改寫 Stack」，但不確定這種方式有沒有符合。
 */
public class Stack {

	private int[] result = new int[0];
	private int topV;

	public int pop() {
		int k = 0;
		k = order(k);
		topV = result[k];
		result[k] = 0;
		return topV;
	}

	public int order(int k) {
		if (result[k] == 0 && k < result.length / 2) {
			k++;
			return order(k);
		}

		return k;
	}

	public void push(int k) {
		result = add(k, result);
	}

	private int[] add(int k, int[] lastResult) {

		int[] a = new int[lastResult.length + 2];
		a[0] = k;
		a[a.length - 1] = k;

		for (int i = 1; i < a.length - 1; i++) {
			a[i] = lastResult[i - 1];
		}

		return a;

	}

}
