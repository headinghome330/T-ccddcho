package us.dontcareabout.ccddcho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();

	public int getSize() {
		return cards.size();
	}

	/**
	 * 接收牌，放在牌庫底部。
	 */
	public void receive(Card card) {
		cards.add(card);
	}

	/**
	 * 接收牌，放在牌庫底部。
	 */
	public void receive(Card[] cards) {
		receive(Arrays.asList(cards));
	}

	/**
	 * 接收牌，放在牌庫底部。
	 */
	public void receive(List<Card> cards) {
		this.cards.addAll(cards);
	}

	/**
	 * @return 出最上面一張牌，牌庫會減少
	 */
	public Card deal() {
		return cards.remove(0);
	}

	/**
	 * @return 出最上面 N 張牌，牌庫會減少
	 */
	public List<Card> deal(int amount) {
		//List<Card> result = cards.subList(0, amount);
		//XXX 用這招，如果 Caller 是 Deck constructor
		//會炸 ConcurrentModificationException，原因... 懶得追  [眼神死]
		//所以還是自己乖乖建立 ArrayList instance...

		ArrayList<Card> result = new ArrayList<>();

		for (int i = 0; i < amount; i++) {
			result.add(cards.remove(0));
		}

		return result;
	}

	/**
	 * @return 出指定位置的牌，牌庫會減少
	 */
	public Card play(int index) {
		return cards.remove(index);
	}

	/**
	 * @return 指定位置的牌，牌庫<b>**不會**</b>減少
	 */
	public Card cardAt(int index) {
		return cards.get(index);
	}
}
