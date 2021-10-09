package us.dontcareabout.ccddcho.player;

import us.dontcareabout.ccddcho.Deck;
import us.dontcareabout.ccddcho.util.ConsoleUtil;

public class ConsolePlayer extends Player {

	public ConsolePlayer(String name) {
		super(name);
	}

	@Override
	public int step1(Deck onTable, Deck onHand) {
		ConsoleUtil.print(onTable, " 桌面 ");
		ConsoleUtil.print(onHand, " " + name + "手牌 ");
		System.out.print("請指定牌：");
		return ConsoleUtil.numberInput();
	}

	@Override
	public int pick(Deck candidate) {
		ConsoleUtil.print(candidate, " 桌面可選 ");
		System.out.print("請指定牌：");
		return ConsoleUtil.numberInput();
	}
}