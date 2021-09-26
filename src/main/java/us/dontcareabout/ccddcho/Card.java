package us.dontcareabout.ccddcho;

public class Card {
	private int type;
	private int value;

	/**
	 * 為了不破壞 interface 而硬留下來的 QQ
	 * @param number 值域：-2～51，負數代表鬼牌
	 */
	public Card(int number) {
		this(
			number < 0 ? -1 : number / 13,
			number < 0 ? Math.abs(number) : number % 13 + 1
		);
	}

	/**
	 * @param type 花色數值，邏輯參見 {@link #花色()}
	 * @param value 點數
	 */
	public Card(int type, int value) {
		this.type = type;
		this.value = value;
	}

	public String 花色() {
		switch(type) {
		case -1: return "鬼牌";
		case 0: return "黑桃";
		case 1: return "紅心";
		case 2: return "方塊";
		case 3: return "梅花";
		}

		//基本上不會到這邊
		return "WTF?";
	}

	public int 點數() {
		return value;
	}

	public String 牌() {
		return 花色() + 點數();
	}
}
