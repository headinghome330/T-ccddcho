package us.dontcareabout.ccddcho.basic.Issue_13;

import java.util.EmptyStackException;

public class StringAck implements IStack {
	private String s = "";
	private int size;
	private static final String comma = ",";

	@Override
	public void push(int k) {
		size++;
		s = s + k + comma;
	}

	@Override
	public int pop() {
		int popElement = peek();
		size--;

		if (!isEmpty()) {
			s = s.substring(0, s.lastIndexOf(comma, s.length() - 2) + 1);
		} else {
			s = "";
		}

		return popElement;
	}


	@Override
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}

		return Integer.valueOf(s.substring(s.lastIndexOf(comma, s.length() - 2) + 1, s.length() - 1));
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

}
