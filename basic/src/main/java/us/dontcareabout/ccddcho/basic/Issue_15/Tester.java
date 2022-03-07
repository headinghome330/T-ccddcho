package us.dontcareabout.ccddcho.basic.Issue_15;

public class Tester {

	public static void main(String[] args) {
		System.out.println(FibR.fibonacci(0, 1, 8));

		Fib1 fib = new Fib1(1, 2);
		
		System.out.println(fib.fibonacci(0));
		System.out.println(fib.fibonacci(1));
		System.out.println(fib.fibonacci(2));
		System.out.println(fib.fibonacci(2));
		System.out.println(fib.fibonacci(3));
		System.out.println(fib.fibonacci(4));
		System.out.println(fib.fibonacci(5));
		System.out.println(fib.fibonacci(6));
	}

}
