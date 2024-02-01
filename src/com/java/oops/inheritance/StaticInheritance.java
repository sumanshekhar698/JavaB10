package com.java.oops.inheritance;

public class StaticInheritance {

	public static void main(String[] args) {
		N n = new N();
//		n.hello();
		n.hi();// static things can be inherited
		System.out.println(n.temp);
		
		System.out.println(N.temp);
		System.out.println(M.temp);

	}
}

class M {

	static int temp = 0;

	void hello() {
		System.out.println("Hello M");
	}

	static void hi() {
		System.out.println("Hiiie M");
	}

}

class N extends M {
	
//	@Override
	static void hi() {//Method Hiding
		System.out.println("Hiiie N");
	}
}