package com.java.basics;

public class CheckANumberISPositiveANdEven {

	public static void main(String[] args) {

		int x = -99;//Variable Scope

		if (x > 0) {
			if (x % 2 == 0) {
				int y =99;
				System.out.println("EVEN AND POSITIVE");
			} else
				System.out.println("ERROR 1");

		} else {
			System.out.println("ERROR 2");

		}

		x = 9;
		if (x > 0 && x % 2 == 0)///LOGICAL AND OPERATOR
			System.out.println("EVEN AND POSITIVE");
		else
			System.out.println("ERROR 1");
		
//		System.out.println(y);

	}

}
