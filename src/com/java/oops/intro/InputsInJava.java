package com.java.oops.intro;

import java.util.Scanner;

public class InputsInJava {

	public static void main(String[] args) {

		// Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a no");
		int num = scanner.nextInt();
		System.out.println("NUM :: " + num);

	
		scanner.close();
		num = scanner.nextInt();
		System.out.println("NUM :: " + num);
	}

}
