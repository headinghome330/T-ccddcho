package us.dontcareabout.ccddcho.basic.Issue_13;

import java.util.EmptyStackException;

public class StringAck implements IStack {
	private String s = "";
	private int size;

	@Override
	public void push(int k) {
		size++;

		if (!"".equals(s)) {
			s += ",";
		}
		
		s += k;
	}

	@Override
	public int pop() {
		size--;

		if (size < 0) {
			throw new EmptyStackException();
		}
		
		int popElement = Integer.valueOf(s.substring(s.lastIndexOf(",", s.length()) + 1));
		
		if (size != 0) {
			s = s.substring(0, s.lastIndexOf(",", s.length()));
		}
		
		if (size == 0) {
			s = "";			
		}
		
		return popElement;
	}

	@Override
	public int peek() {
		if (size == 0) {
			throw new EmptyStackException();
		}

		return Integer.valueOf(s.substring(s.lastIndexOf(",", s.length()) + 1));
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

}
