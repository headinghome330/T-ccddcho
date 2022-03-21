package us.dontcareabout.ccddcho.basic.Issue_44;

public class DailyFee {
	private Meals mealC;
	private Meals mealF = new Meals("free");

	public DailyFee() {
		mealC = new Meals();
	}

	public static void main(String[] args) {
		new DailyFee();
	}
}

