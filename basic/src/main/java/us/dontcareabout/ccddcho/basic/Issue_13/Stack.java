package us.dontcareabout.ccddcho.basic.Issue_13;

public class Stack {

	private int[] result;
	private int size;

	public int pop() {
		size--;

		if (size < 0) {
			throw new ArrayIndexOutOfBoundsException(size);
		}

		return result[size];
	}

	public void push(int k) {
		// 當 pop 完整個 array 後，整理不會用到的記憶體
		if (size == 0) {
			result = new int[0];
		}

		size++;

		if (size > result.length) {
			add(k);
		}

		// 表示有 pop 過
		if (size == result.length) {
			result[size - 1] = k;
		}

	}

	private void add(int k) {
		int[] a = new int[result.length + 1];
		a[a.length - 1] = k;

		for (int i = 0; i < result.length; i++) {
			a[i] = result[i];
		}

		result = a;
	}
	
	public int peek() {
		return result[result.length - 1];
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	
}
