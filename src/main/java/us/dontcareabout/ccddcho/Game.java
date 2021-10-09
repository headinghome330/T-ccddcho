package us.dontcareabout.ccddcho;

import java.util.ArrayList;
import java.util.List;

import us.dontcareabout.ccddcho.util.CardUtil;

public class Game {
//	Player[] players;

	PlayerInfo[] playerInfo;

	List<Card> 暗牌庫;
	List<Card> 明牌庫 = new ArrayList<>();

	/**
	 * n 個人各發 24 / n 張牌，然後翻出四張牌進明牌庫
	 */
	public Game(int n) {
		暗牌庫 = CardUtil.genDeck();	//先不洗牌了幹

		playerInfo = new PlayerInfo[n];

		for (int i = 0; i < n; i++) {
			playerInfo[i] = new PlayerInfo();

			//發牌
			for (int i2 = 0; i2 < 24 / n; i2++) {
				playerInfo[i].handReceive(暗牌庫.remove(0));
			}
		}

		//四張明牌
		for (int i = 0; i < 4; i++) {
			明牌庫.add(暗牌庫.remove(0));
		}
	}

	//偉大的案主口中的「遊戲怎麼進行」
	public void start() {
		//TODO
	}
	
	private class PlayerInfo {
		List<Card> hand = new ArrayList<>();
		List<Card> score = new ArrayList<>();

		public void handReceive(Card card) {
			hand.add(card);
		}
	}
}