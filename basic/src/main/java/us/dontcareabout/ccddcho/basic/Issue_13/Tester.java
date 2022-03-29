package us.dontcareabout.ccddcho.basic.Issue_13;

public class Tester {

	public static void main(String[] args) {
		IStack stack = new StringAck();
		stack.push(100);
		stack.push(5566);
		System.out.println(stack.pop()); // 要印出 5566
		stack.push(9487);
		stack.push(940);
		System.out.println(stack.peek());// 要印出 940
		System.out.println(stack.pop()); // 要印出 940
		System.out.println(stack.pop()); // 要印出 9487
		stack.push(555);
		stack.push(333);
		stack.push(222);
		stack.push(111);
		System.out.println(stack.pop()); // 要印出 111
		System.out.println(stack.pop()); // 要印出 222
		System.out.println(stack.peek());// 要印出 333
		System.out.println(stack.pop()); // 要印出 333
		System.out.println(stack.pop()); // 要印出 555
		System.out.println(stack.pop()); // 要印出 100
		System.out.println(stack.isEmpty());
	}

}
