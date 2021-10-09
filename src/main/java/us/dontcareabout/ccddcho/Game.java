package us.dontcareabout.ccddcho;

import java.util.List;

import us.dontcareabout.ccddcho.player.Player;

public class Game {
	private final Player[] players;
	private final PlayerInfo[] infos;
	private final Deck deck = new Deck();
	private final Deck onTable = new Deck();

	private int nowPlayer = 0;

	public Game(Player[] players) {
		if (players.length < 2 || players.length > 4) {
			throw new IllegalArgumentException("玩家人數必須是 2～4 人");
		}

		deck.receive(GM.genDeck());	//TODO 洗牌
		onTable.receive(deck.deal(4));

		this.players = players;
		infos = new PlayerInfo[players.length];

		for (int i = 0; i < players.length; i++) {
			players[i].setGame(this);
			infos[i] = new PlayerInfo(deck.deal(24 / players.length));
		}
	}

	public void start() {
		int turn = 0;
		while(turn <= 24 / players.length) {
			Player player = players[nowPlayer];
			PlayerInfo info = infos[nowPlayer];

			int index = player.step1(onTable, info.hand);
			Card card = info.hand.play(index);
			Deck candidate = findCandidate(card);

			if (candidate.getSize() == 0) {
				onTable.receive(card);
			} else if (candidate.getSize() == 1) {
				match(card, candidate.cardAt(0), info);
			} else {
				match(card, candidate.cardAt(player.pick(candidate)), info);
			}

			//TODO 還少「翻牌再對一次」

			nowPlayer = (nowPlayer + 1) % players.length;
		}
	}

	private Deck findCandidate(Card card) {
		Deck result = new Deck();

		for (int i = 0; i < onTable.getSize(); i++) {
			if (Rule.isMatch(card, onTable.cardAt(i))) {
				result.receive(onTable.cardAt(i));
			}
		}

		return result;
	}

	private void match(Card card, Card pick, PlayerInfo info) {
		onTable.play(pick);
		info.getScore(card, pick);
	}

	private class PlayerInfo {
		final Deck hand = new Deck();
		final Deck score = new Deck();

		public PlayerInfo(List<Card> deal) {
			hand.receive(deal);
		}

		public void getScore(Card card, Card card2) {
			score.receive(card);
			score.receive(card2);
		}
	}
}