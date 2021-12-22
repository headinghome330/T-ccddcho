package us.dontcareabout.ccddcho.util;

import us.dontcareabout.ccddcho.Card;

public class StringUtil {
	private static final String[] cardNumber = {
		" A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9",
		"10", " J", " Q", " K"
	};

	public static String from(Card card) {
		return card.type.name() + cardNumber[card.value - 1];
	}
}
