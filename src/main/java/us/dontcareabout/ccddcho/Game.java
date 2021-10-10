package us.dontcareabout.ccddcho;

import us.dontcareabout.ccddcho.util.CardUtil;

public class Game {
//	Player[] players;

	PlayerInfo[] playerInfo;

	Deck 暗牌庫 = new Deck();
	Deck 明牌庫 = new Deck();

	/**
	 * n 個人各發 24 / n 張牌，然後翻出四張牌進明牌庫
	 */
	public Game(int n) {
		暗牌庫.receive(CardUtil.genDeck());	//先不洗牌了幹

		playerInfo = new PlayerInfo[n];

		for (int i = 0; i < n; i++) {
			playerInfo[i] = new PlayerInfo();

			//發牌
			for (int i2 = 0; i2 < 24 / n; i2++) {
				playerInfo[i].handReceive(暗牌庫.deal());
			}
		}

		//四張明牌
		明牌庫.receive(暗牌庫.deal(4));
	}

	//偉大的案主口中的「遊戲怎麼進行」
	public void start() {
		//TODO
	}

	private class PlayerInfo {
		Deck hand = new Deck();
		Deck score = new Deck();

		public void handReceive(Card card) {
			hand.receive(card);
		}
	}
}