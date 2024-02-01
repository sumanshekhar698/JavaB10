package com.java.oops.inheritance.casting;

public class Main {
	public static void main(String[] args) {

		// Typcasting
		// -> Upcasting
		// -> Downcating
		B b = new B();
		b.hi();
		b.namaste();

		A a = b;// Upcasting | proomitinga child ref to a prent ref [Upcasting is implicit]
		a.hi();
//		a.namaste();

		A a1 = new B();// Upcasting

//		Downcasting
		A a2 = new A();

		if (a2 instanceof B) {//it is must while downcasting
			B b1 = (B) a2;// Downcasting - Explicit
		}
		B b3 = (B) a1;
		b3.namaste();

	}
}

class A {

	int temp = 0;

	void hello() {
		System.out.println("Hello M");
	}

	void hi() {
		System.out.println("Hiiie M");
	}
}

class B extends A {

	@Override
	void hi() {
		System.out.println("Hiiie N");
	}

	void namaste() {
		System.out.println("Namaste N");
	}
}
