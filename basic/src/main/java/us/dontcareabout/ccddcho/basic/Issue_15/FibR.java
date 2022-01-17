package us.dontcareabout.ccddcho.basic.Issue_15;

public class FibR {

	public static int fibonacci(int f, int s, int d) {
		if (d == 0) {
			return f;
		}
		return fibonacci(s, f + s, --d);

	}
}
