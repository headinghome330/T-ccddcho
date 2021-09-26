package us.dontcareabout.ccddcho;

public class Card {
	private int number;

	public Card(int value) {
		this.number = value;
	}

	public String 花色() {
		if (number < 0) { return "鬼牌"; }

		int result = number / 13;

		switch(result) {
		case 0: return "黑桃";
		case 1: return "紅心";
		case 2: return "方塊";
		case 3: return "梅花";
		}

		//基本上不會到這邊
		return "WTF?";
	}

	public int 點數() {
		if (number < 0) { return Math.abs(number); }

		return number % 13 + 1;
	}

	/**
	 * caller 不要亂傳值，沒有防呆，沒有沒有沒有。
	 * @return
	 */
	public String 牌() {
		return 花色() + 點數();
	}
}
