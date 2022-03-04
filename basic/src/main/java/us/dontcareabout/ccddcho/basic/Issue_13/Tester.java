package us.dontcareabout.ccddcho.basic.Issue_13;

public class Tester {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(5566);
		System.out.println(stack.pop()); // 要印出 5566
		stack.push(9487);
		stack.push(940);
		System.out.println(stack.pop()); // 要印出 940
		System.out.println(stack.pop()); // 要印出 9487
		System.out.println(stack.pop()); // 要印出 100
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		
	}

}
