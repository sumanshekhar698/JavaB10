package com.java.oops.strings;

public class RotationOfAString {

	public static void main(String[] args) {

		String x = "apple";
		String y = "eappl";// eappleappl

		boolean result = rotationChecker(x, y);
		System.out.println(result);
	}

	private static boolean rotationChecker(String x, String y) {
		if (x.length() != y.length())
			return false;

		y = y + y;
		return y.contains(x);
	}

}
