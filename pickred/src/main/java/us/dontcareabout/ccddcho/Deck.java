package us.dontcareabout.ccddcho;

import java.util.ArrayList;
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
	public void receive(Deck deck) {
		receive(deck.cards);
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
	public Deck deal(int amount) {
		//List<Card> result = cards.subList(0, amount);
		//XXX 用這招，如果 Caller 是 Deck constructor
		//會炸 ConcurrentModificationException，原因... 懶得追  [眼神死]
		//所以還是自己乖乖建立 ArrayList instance...

		Deck result = new Deck();

		for (int i = 0; i < amount; i++) {
			result.receive(cards.remove(0));
		}

		return result;
	}

	/**
	 * @return 出指定位置的牌，牌庫會減少
	 */
	public Card play(int index) {
		return cards.remove(index);
	}

	public void play(Card card) {
		play(find(card));
	}

	/**
	 * @return 指定的牌的 index 值（起始值 0），
	 * 	如果沒有指定的牌會回傳 -1。
	 */
	public int find(Card card) {
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).equals(card)) { return i; }
		}

		return -1;
	}

	/**
	 * @return 指定位置的牌，牌庫<b>**不會**</b>減少
	 */
	public Card cardAt(int index) {
		return cards.get(index);
	}
}