package com.java.oops.exception_handling;

import java.util.Scanner;

public class TryWithResouirce {

	public static void main(String[] args) {

		System.out.println("START");

		int arr[] = { 43, 5, 56, 45, 6, 99 };

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println(arr[20 / scanner.nextInt()]);
			System.out.println();
		} catch (Exception e) {

		}

		System.out.println("END");
	}

}
