package com.java.basics;

public class Conditionals {

	public static void main(String[] args) {

		int x = -88;
 
//		if
//		if else
//		if else if   else if
//		if else if    else if      else
		if (x < 0) {// if else ladder
			System.out.println("NEGATIVE");
		} else if (x == 0)
			System.out.println("ZERO");
		else
			System.out.println("POSITIVE");

		
		if (x < 0) {//
			System.out.println("NEGATIVE");
		}
		if (x == 0) {
			System.out.println("ZERO");
		}
		if (x > 0) {
			System.out.println("POSITIVE");
		}

	}

}
