package com.java.oops.exception_handling;

public class UnCheckedExceptions {

	public static void main(String[] args) {

		System.out.println("START");

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {// InterruptedException - checked Exception

				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("END");

	}
}
