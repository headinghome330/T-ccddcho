package us.dontcareabout.ccddcho.util;

import us.dontcareabout.ccddcho.Deck;

public class ConsoleUtil {
	public static void print(Deck deck) {
		print(deck, "------------");
	}

	public static void print(Deck deck, String title) {
		boolean flag = false;

		System.out.println("------------" + title + "------------");

		for (int i = 0; i < deck.getSize(); i++) {
			flag = false;
			System.out.print(StringUtil.from(deck.cardAt(i)));
			System.out.print('\t');

			if (i % 5 == 4) {
				System.out.println();
				flag = true;
			}
		}

		System.out.println();

		if (!flag) { System.out.println(); }
	}
}
