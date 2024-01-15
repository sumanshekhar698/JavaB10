package com.java.oops.strings;

public class ImmutabilityOfString {// String are immutable

	public static void main(String[] args) {
		String s1 = "  Apple Brownie    ";
		s1 = s1.toLowerCase();// it will create a new copy of that String
		System.out.println(s1);

		String s2 = "  Apple Brownie    ";
		String s3 = "Apple Brownie";// 0
		String s4 = "appLe BrOwnie";// 0

		System.out.println(s2.toUpperCase());
		System.out.println(s2.trim());

		System.out.println(s3.charAt(0));
		System.out.println(s3.length());
		System.out.println(s3.charAt(s3.length() - 1));

		System.out.println(s3.contains("ppl"));

		if (s3.equalsIgnoreCase(s4)) {
			System.out.println("Equal Values");
		} else {
			System.out.println("Unequal Values");
		}

		System.out.println(s3.indexOf('e'));
		System.out.println(s3.lastIndexOf('e'));

		System.out.println(s3.substring(1, 5));// 1 is start(inclusive) and 4 is end(Exclusive)

	}

}
