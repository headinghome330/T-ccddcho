package us.dontcareabout.ccddcho.basic.Issue_13;

public class Stack {

	private int[] stack = new int[1];

	public int pop() {
		int out = stack[stack.length - 2];
		stack = remove(out, stack);
		return out;
	}

	public void push(int k) {
		stack[stack.length - 1] = k;
		stack = add(k, stack);
	}

	private int[] add(int k, int[] a) {
		int[] stack = new int[a.length + 1];

		for (int i = a.length - 1; i >= 0; i--) {
			stack[i] = a[i];
		}

		return stack;
	}

	private int[] remove(int k, int[] a) {
		int[] stack = new int[a.length - 1];
		a[a.length - 2] = 0;

		for (int i = a.length - 2; i >= 0; i--) {
			stack[i] = a[i];
		}

		return stack;
	}
}
