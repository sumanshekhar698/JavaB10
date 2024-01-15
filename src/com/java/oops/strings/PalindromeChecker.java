package com.java.oops.strings;

public class PalindromeChecker {

	public static void main(String[] args) {


		String x = "RADAR";
		x ="apple";
		String xReversed = "";
		
		for (int i = x.length() -1; i >=0; i--) {
			xReversed += x.charAt(i);
		}
		System.out.println(xReversed);
		if(x.equals(xReversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("NOT a palindrome");
		}

	}

}
