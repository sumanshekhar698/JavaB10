package com.java.oops.exception_handling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		try {
			a();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void a() throws InterruptedException {
		System.out.println("a");

		b();
	}

	static void b() throws InterruptedException {
		System.out.println("a");

		c();
	}

	private static void c() throws InterruptedException {
//		System.out.println(9 / 0);
		for (int i = 0; i < 5; i++) {
			Thread.sleep(500);
		}

	}

}
