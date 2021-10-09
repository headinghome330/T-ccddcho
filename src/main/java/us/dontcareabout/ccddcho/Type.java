package us.dontcareabout.ccddcho;

public enum Type {
	黑桃(true),
	紅心(false),
	磚塊(true),
	梅花(false),
	鬼牌(false)
	;


	private boolean black;

	private Type(boolean black) {
		this.black = black;
	}

	public boolean isBlack() {
		return black;
	}

	public void setBlack(boolean black) {
		this.black = black;
	}
}
