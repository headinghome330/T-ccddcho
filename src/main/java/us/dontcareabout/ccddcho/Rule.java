package us.dontcareabout.ccddcho;

public class Rule {
	public static boolean isMatch(Card c1, Card c2) {
		return c1.value < 10 ? c1.value + c2.value == 10 : c1.value == c2.value;
	}
}
