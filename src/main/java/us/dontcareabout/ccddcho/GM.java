package us.dontcareabout.ccddcho;

import java.util.Random;

public class GM {
	private static final Random random = new Random();

	/**
	 * @return 不含鬼牌的一副牌
	 */
	public static Card[] genDeck() {
		Card[] result = new Card[52];
		int index = 0;

		for (Type type : Type.values()) {
			if (type == Type.鬼牌) { continue; }

			for (int i = 1; i < 14; i++) {
				result[index] = new Card(type, i);
				index++;
			}
		}

		return result;
	}

	public static void shuffle(Card[] array) {
		int last = array.length - 1;
		int target;

		while(last > 0) {
			target = random.nextInt(last + 1);
			Card tmp = array[last];
			array[last] = array[target];
			array[target] = tmp;
			last--;
		}
	}
}
