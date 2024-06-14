package edu.atria.java.second;

import edu.atria.java.first.Base;

public class ExecutorTwo extends Base {

	public static void main(String[] args) {
		Base bTwo = new Base();

		// private members are not accessible outside the first package
		// System.out.println(bTwo.variablePrivate);

		/* default variables are not visible in different package but it can be visible
		 in the different class of same package*/
		// System.out.println(bTwo.variableDefault);

		ExecutorTwo ex = new ExecutorTwo();
		System.out.println(ex.variableProtected);
		System.out.println(bTwo.variablePublic);
	}

}
