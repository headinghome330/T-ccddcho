package us.dontcareabout.ccddcho;

public class App {
	public static void main(String[] args) {
		//用 0～51 來表示一副撲克牌
		//cc 版本：大鬼牌 52、小鬼牌 53
		//ps 版本：大鬼牌 -1、小鬼牌 -2

		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 13; i2++) {
				int number = i * 13 + i2;
				System.out.print(牌(number) + '\t');
			}
			System.out.println();
		}

		System.out.println(牌(-1));
		System.out.println(牌(-2));
	}

	public static String 花色(int value) {
		if (value < 0) { return "鬼牌"; }

		int result = value / 13;

		switch(result) {
		case 0: return "黑桃";
		case 1: return "紅心";
		case 2: return "方塊";
		case 3: return "梅花";
		}

		//基本上不會到這邊
		return "WTF?";
	}

	public static int 點數(int value) {
		if (value < 0) { return Math.abs(value); }

		return value % 13 + 1;
	}

	public static String 牌(int value) {
		return 花色(value) + 點數(value);
	}

}
