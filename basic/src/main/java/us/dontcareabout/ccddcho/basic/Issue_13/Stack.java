package us.dontcareabout.ccddcho.basic.Issue_13;

/**
 * 目前的版本修改了原本多一個 index 的部分，當 push() 時同時在兩個 stack 上增加數字，分別是 stack[] 及 temp[]
 * stack[] 依然保有完整的 push() 紀錄，而 temp() 則是隨著 pop() 而去 remove() 內容
 * 保有 stack[]  push() 紀錄的好處就是，可以在之後繼續使用 stack[] 內的紀錄
 * 
 * p.s. 關於 Must FIX 有要求，「pop() 的時候不用清除來改寫 Stack」，但不確定這種方式有沒有符合。
 */
public class Stack {

	private int[] stack = new int[0];
	private int[] temp = new int[0];
		
	
	public int pop() {
		int out = temp[temp.length - 1];
		temp = remove(out, temp);
		return out;
	}

	public void push(int k) {
		stack = add(k, stack);
		temp= add(k, temp);
	}
 
	private static int[] add(int k, int[] a) {
		int[] lastStack = a;
		if (a.length == 0) {
			a = new int[a.length + 1];
			a[a.length - 1] = k;
		} else {
			a = new int[a.length + 1];
			a[a.length - 1] = k;

			for (int i = lastStack.length - 1; i >= 0; i--) {
				a[i] = lastStack[i];
			}

		}
		return a;
	}

	private static int[] remove(int k, int[] a) {
		int[] popStack = new int[a.length - 1];

		for (int i = a.length - 2; i >= 0; i--) {
			popStack[i] = a[i];
		}

		return popStack;
	}
}
