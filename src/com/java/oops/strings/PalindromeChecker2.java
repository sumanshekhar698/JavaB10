package com.java.oops.strings;

public class PalindromeChecker2 {

	public static void main(String[] args) {

		String x = "RADAR";
		StringBuilder sb = new StringBuilder(x);
		System.out.println(x.equals(sb.reverse().toString()) ? "Palindrome " : "Not a palindrome");

	}

}
