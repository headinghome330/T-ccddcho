package us.dontcareabout.ccddcho.basic.Issue_13;

import java.util.EmptyStackException;

public class Stack {

	private int[] result = new int[1];
	private int size;

	public int pop() {
		size--;

		if (size < 0) {
			throw new EmptyStackException();
		}

		return result[size];
	}

	public void push(int k) {
		size++;

		if (size <= result.length) {
			result[size - 1] = k;
		}
		
		if (size > result.length) {
			add();
			result[size - 1] = k;			
		}
	}

	/**
	 * 清除 Stack 中已經 pop() 過的數字，並使 Stack 大小等於 size
	 */
	public void reduce() {
		int[] a = new int[size];

		for (int i = 0; i < a.length; i++) {
			a[i] = result[i];
		}

		result = a;
	}

	private void add() {
		int[] a = new int[result.length * 2];

		for (int i = 0; i < result.length; i++) {
			a[i] = result[i];
		}

		result = a;
	}

	public int peek() {
		if (size == 0) {
			throw new EmptyStackException();
		}

		return result[size - 1];
	}

	public boolean isEmpty() {
		return size == 0;
	}

}
