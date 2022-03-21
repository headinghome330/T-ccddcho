package us.dontcareabout.ccddcho.basic.Issue_13;

import java.util.EmptyStackException;

public class StringAck implements IStack {
	private String s = "";
	private int commaIndex;

	@Override
	public void push(int k) {
		if (!"".equals(s)) {
			s += ",";
		}
		s += String.valueOf(k);
		commaIndex = s.lastIndexOf(",");
	}

	private void reduce() {
		s = s.substring(0, commaIndex);
		commaIndex = s.lastIndexOf(",", s.lastIndexOf(","));
	}

	@Override
	public int pop() {
		int popElement;
		if (commaIndex > 0) {
			popElement = Integer.valueOf(s.substring(commaIndex + 1, s.length()));
			reduce();
			return popElement;
		}

		if (commaIndex == -1 && s.length() > 0) {
			popElement = Integer.valueOf(s);
			s = "";
			return popElement;
		}

		throw new EmptyStackException();
	}

	@Override
	public int peek() {
		if (commaIndex == -1 && s.length() < 0 || commaIndex == 0) {
			throw new EmptyStackException();
		}

		return Integer.valueOf(s.substring(commaIndex + 1));
	}

	@Override
	public boolean isEmpty() {
		return s.equals("");
	}

}
