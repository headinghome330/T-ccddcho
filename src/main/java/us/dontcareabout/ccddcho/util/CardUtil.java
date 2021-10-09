package us.dontcareabout.ccddcho.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import us.dontcareabout.ccddcho.Card;
import us.dontcareabout.ccddcho.Type;


public class CardUtil {
	private static final Random random = new Random();

	/**
	 * @return 不含鬼牌的一副牌
	 */
	public static List<Card> genDeck() {
		List<Card> result = new ArrayList<>();

		for (Type type : Type.values()) {
			if (type == Type.鬼牌) { continue; }

			for (int i = 1; i < 14; i++) {
				result.add(new Card(type, i));
			}
		}

		return result;
	}

	public static void shuffle(List<Card> cards) {
		int last = cards.size() - 1;
		int target;

		while(last > 0) {
			target = random.nextInt(last + 1);
			Card tmp = cards.get(last);
			cards.set(last, cards.get(target));
			cards.set(target, tmp);
			last--;
		}
	}
}
