package us.dontcareabout.ccddcho.basic;

public class Issue_53 {

	private Integer i;
	
	private int foo() {
		return i;
	}

	public static void main(String[] args) {
		Issue_53 npe = null;
		System.out.println(npe.i);// Accessing or modifying the field of a null object.
		npe.foo();// Calling the instance method of a null object.
	}
}
