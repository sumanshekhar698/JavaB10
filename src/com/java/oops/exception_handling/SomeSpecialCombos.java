package com.java.oops.exception_handling;

import java.util.Scanner;

public class SomeSpecialCombos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("START");

		int arr[] = { 43, 5, 56, 45, 6, 99 };

		try {
			System.out.println(arr[20 / scanner.nextInt()]);
			System.out.println();
		} finally {
			System.out.println("Finally called");
			scanner.close();
		}

//		System.out.println("END");
	}

}
