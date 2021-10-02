package us.dontcareabout.ccddcho;

public class GM {

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

}
