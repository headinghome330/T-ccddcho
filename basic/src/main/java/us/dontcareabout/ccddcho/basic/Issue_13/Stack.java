package us.dontcareabout.ccddcho.basic.Issue_13;

public class Stack {

	private int[] result = new int[0];
	private int size;

	public int pop() {
		size--;
		return result[size];
	}

	public void push(int k) {

		if (result.length != size) {
			result = minus();
		}
		result = add(k, result);
		size = result.length;
	}

	
	private int[] minus() {
		int[] a = new int[result.length - 1];

		for (int i1 = 0; i1 < result.length - 1; i1++) {
			a[i1] = result[i1];
		}

		return a;
	}

	private int[] add(int k, int[] lastResult) {

		int[] a = new int[lastResult.length + 1];
		a[a.length - 1] = k;

		for (int i = 0; i < lastResult.length; i++) {
			a[i] = lastResult[i];
		}

		return a;

	}

}
