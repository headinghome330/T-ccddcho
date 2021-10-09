package us.dontcareabout.ccddcho;

import java.util.ArrayList;
import java.util.List;

import us.dontcareabout.ccddcho.util.CardUtil;

public class Game {
//	Player[] players;

	//我她嗎就只讓兩個玩家玩！
	ArrayList<Card>[] playerHand;
	ArrayList<Card>[] playerScore;

	List<Card> 暗牌庫;
	List<Card> 明牌庫 = new ArrayList<>();

	/**
	 * n 個人各發 24 / n 張牌，然後翻出四張牌進明牌庫
	 */
	public Game(int n) {
		暗牌庫 = CardUtil.genDeck();	//先不洗牌了幹

		playerHand = new ArrayList[n];
		playerScore = new ArrayList[n];

		for (int i = 0; i < n; i++) {
			playerHand[i] = new ArrayList<>();

			//發牌
			for (int i2 = 0; i2 < 24 / n; i2++) {
				playerHand[i].add(暗牌庫.remove(0));
			}

			playerScore[i] = new ArrayList<>();
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
}