package us.dontcareabout.ccddcho.player;

import us.dontcareabout.ccddcho.Deck;
import us.dontcareabout.ccddcho.Game;

public abstract class Player {
	public final String name;
	private Game game;

	public Player(String name) {
		this.name = name;
	}

	public abstract int step1(Deck onTable, Deck onHand);
	public abstract int pick(Deck candidate);

	public void setGame(Game game) {
		this.game = game;
	}
}