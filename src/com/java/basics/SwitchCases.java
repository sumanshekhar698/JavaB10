package com.java.basics;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number \n 1: Coke \n 2: Mirinda \n 3 : Milk \n 4: Water ");
		
		int input = sc.nextInt();
		
		if(input == 1) {
			System.out.println("Enjoy Coke");
		} else if (input == 2) {
			System.out.println("Enjoy Mirinda");
		}else if (input == 3) {
			System.out.println("Enjoy Milk");
		}else if (input == 4) {
			System.out.println("Enjoy Water");
		} else {
			System.out.println("INVALID INPUT");
		}
		

	}

}
