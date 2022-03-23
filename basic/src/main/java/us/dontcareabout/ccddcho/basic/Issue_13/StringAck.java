package us.dontcareabout.ccddcho.basic.Issue_13;

import java.util.EmptyStackException;

public class StringAck implements IStack {
	private String s = "";
	private int commaIndex;

	@Override
	public void push(int k) {
		if (s.length() > commaIndex) {
			s = s.substring(0, commaIndex) + "," + k;
		}
		
		if (commaIndex <= 0) {
			s += k;
		}
		
		if (s.length() == commaIndex) {
			s += "," + k;
		}
		
		commaIndex = s.length();
	}


	@Override
	public int pop() {

		if (commaIndex > 0) {
			int popElement = Integer.valueOf(s.substring(s.lastIndexOf(",", commaIndex - 1) + 1, commaIndex));
			commaIndex = s.lastIndexOf(",", commaIndex - 1);
			return popElement;
		}

		if (commaIndex == -1 && s.length() > 0) {
			return Integer.valueOf(s.substring(0, s.indexOf(",")));
		}

		throw new EmptyStackException();
	}

	@Override
	public int peek() {
		if (commaIndex == -1 && s.length() < 0 || commaIndex == 0) {
			throw new EmptyStackException();
		}

		return Integer.valueOf(s.substring(s.lastIndexOf(",", commaIndex - 1) + 1, commaIndex));
	}

	@Override
	public boolean isEmpty() {
		return commaIndex == -1;
	}

}
