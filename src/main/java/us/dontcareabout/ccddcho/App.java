package us.dontcareabout.ccddcho;

public class App {
	public static void main(String[] args) {
		//用 0～51 來表示一副撲克牌
		//cc 版本：大鬼牌 52、小鬼牌 53
		//ps 版本：大鬼牌 -1、小鬼牌 -2

		for (int i = 0; i < 4; i++) {
			for (int i2 = 0; i2 < 13; i2++) {
				Card WTF = new Card(i * 13 + i2);
				System.out.print(WTF.牌() + '\t');
			}
			System.out.println();
		}

		System.out.println(new Card(-1).牌());
		System.out.println(new Card(-2).牌());
	}
}
